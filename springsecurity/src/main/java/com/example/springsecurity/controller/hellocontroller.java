package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;



@RestController
public class hellocontroller {

    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello WORLD"+ request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "This is about" + request.getSession().getId();
    }
    
}
