package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //http://localhost:8080/login?name=Osayd
    // Model : Whenever you want to send data from the controller to the view, you use Model
    @RequestMapping(value = "login", method = RequestMethod.GET) // or @GetMapping("/login") we can use either one to signify that login runs only for GET requests.
    public String showLoginPage() {
        //model.put("name", name);
        // System.out.println("Request Param is " + name); // NOT RECOMMENDED FOR PRODUCTION CODE
        // logger.debug("Request Param is {}" , name);
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST) // or @PostMapping("/login")we can use either one to signify that login runs only for POST requests.
    public String showWelcomePage(){
        return "welcome";
    }
}