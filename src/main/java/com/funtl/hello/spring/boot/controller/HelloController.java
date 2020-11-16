package com.funtl.hello.spring.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController{

    @GetMapping("/")
    public String sayHi(){
        System.out.println("---");
        return "Hello Spring Boot";
    }

}
