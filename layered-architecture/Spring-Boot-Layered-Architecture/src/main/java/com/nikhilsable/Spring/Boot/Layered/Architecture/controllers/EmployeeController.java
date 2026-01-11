package com.nikhilsable.Spring.Boot.Layered.Architecture.controllers;


import com.nikhilsable.Spring.Boot.Layered.Architecture.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: 2dgFI*$#H87yg";
//    }


    @GetMapping(path = "/employees/{employeeId}")
    public EmployeeDTO getEmployeeById (@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId, "nikhil" ,"niks@gmail.com",21, LocalDate.of(2026,1,2),true);

    }
}
