package com.in28minutes.springboot.myfirstwebapp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
    @GetMapping("/say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }
}
