package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String getHello() {
        return helloService.getGreeting();
    }
}
