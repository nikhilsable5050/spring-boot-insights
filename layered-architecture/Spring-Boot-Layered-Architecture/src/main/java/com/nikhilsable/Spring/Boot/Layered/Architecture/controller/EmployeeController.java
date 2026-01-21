package com.nikhilsable.Spring.Boot.Layered.Architecture.controller;

import com.nikhilsable.Spring.Boot.Layered.Architecture.dto.EmployeeDTO;
import com.nikhilsable.Spring.Boot.Layered.Architecture.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {

        EmployeeDTO employeeDTO = employeeService.getEmployee(id);

        if (employeeDTO == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(employeeDTO);
    }
}
