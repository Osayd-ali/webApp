package com.in28minutes.springboot.myfirstwebapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
    @GetMapping("/say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    // Trying to send a html page as a response to the browser
    //@RequestMapping("/say-hello-html")
    //@ResponseBody
    //public String sayHelloHtml(){
    //    StringBuffer sb = new StringBuffer();
    //    sb.append(“<html>”);
    //    sb.append(“<head>”);
    //    sb.append(“<title> My First HTML Page - Changed </title>”);
    //    sb.append(“</head>”);
    //    sb.append(“<body>”);
    //    sb.append(“My First html page with body - Changed”);
    //    sb.append(“</body>”);
    //    sb.append(“</html>”);

    //    return sb.toString();
    //}

    // "say-hello-jsp" => sayHello.jsp
    @GetMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
