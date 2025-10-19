package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //http://localhost:8080/login?name=Osayd
    // Model : Whenever you want to send data from the controller to the view, you use Model
    @GetMapping("/login")
    public String showLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        System.out.println("Request Param is " + name); // NOT RECOMMENDED FOR PRODUCTION CODE
        logger.debug("Request Param is {}" , name);
        return "login";
    }
}
