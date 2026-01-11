package com.nikhilsable.demoApplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping("m")
    public static String myMethod(){
        return "Working on controller";
    }

    @GetMapping("/process-form")
    public String getDataGet(@RequestParam int num1,
                             @RequestParam int num2) {
        int result = num1 + num2;
        return "Result = " + result;
    }

    @PostMapping("/process-form")
    public String getDataPost(@RequestParam int num1,
                              @RequestParam int num2) {
        int result = num1 + num2;
        return "Result = " + result;
    }
}
