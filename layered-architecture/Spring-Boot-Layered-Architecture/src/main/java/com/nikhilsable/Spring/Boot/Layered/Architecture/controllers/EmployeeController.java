package com.nikhilsable.Spring.Boot.Layered.Architecture.controllers;


import com.nikhilsable.Spring.Boot.Layered.Architecture.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: 2dgFI*$#H87yg";
//    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById (@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId, "nikhil" ,"niks@gmail.com",21, LocalDate.of(2026,1,2),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false , name = "inputAge") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hii age "+ age + " " + sortBy;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId((100L));
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from PUT";
    }
}
