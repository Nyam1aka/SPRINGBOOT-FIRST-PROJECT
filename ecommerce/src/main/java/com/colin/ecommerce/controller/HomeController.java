package com.colin.ecommerce.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Colin First Spring project";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is how we work";
    }
}
