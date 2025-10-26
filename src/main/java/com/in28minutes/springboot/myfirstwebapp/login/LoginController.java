package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
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
    public String showWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
        // Capturing name and password and put it in the model map to send it to the view so that we can display it there.
        //Authentication
        //username=in28minutes
        //password=dummy // If these are the credentials, then redirect to welcome page, else show login page again.
        if(authenticationService.authenticate(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }
    // Even form data can be captured using RequestParam, we will capture our login form data using a ModelAttribute
}