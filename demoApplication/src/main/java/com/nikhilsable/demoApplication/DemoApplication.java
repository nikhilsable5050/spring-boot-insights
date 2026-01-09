package com.nikhilsable.demoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		System.out.println(MyController.myMethod());
		SpringApplication.run(DemoApplication.class, args);
	}

}
