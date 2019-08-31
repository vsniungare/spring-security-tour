package com.example.springsecuritybasic.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public String greet(){
        return ("<h1>Welcome</h1>");
    }
}
