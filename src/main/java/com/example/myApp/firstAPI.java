package com.example.myApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstAPI {
    @GetMapping("/")
    public String hello(){
        return "First API";
    }
}
