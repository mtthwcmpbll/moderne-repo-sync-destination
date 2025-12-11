package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeApi {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String getGoodbye() {
        return helloService.getGreeting().replace("Hello", "Goodbye");
    }
}
