package com.example.myApp;

import org.springframework.stereotype.Component;

@Component

public class Dev {
    Laptop laptop;
    public void build(){

        laptop.compile();
        System.out.println("Working on awesome project");
    }
}
