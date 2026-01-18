package com.example.annotationmastery.Controller;

import com.example.annotationmastery.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //@Controller + @ResponseBody
public class EmployeeController {


    @GetMapping("/getEmployee")
    public String getEmployee(){
        return "employee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        return "added";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
        return "updated";
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(Employee employee){
        return "deleted";
    }
}
