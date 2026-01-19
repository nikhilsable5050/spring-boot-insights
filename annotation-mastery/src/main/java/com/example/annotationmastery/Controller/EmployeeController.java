package com.example.annotationmastery.Controller;

import com.example.annotationmastery.Entity.Employee;
import org.springframework.web.bind.annotation.*;

/*
 PURPOSE:
 - This controller demonstrates Spring Boot REST annotations
 - Shows how different HTTP methods work (GET, POST, PUT, DELETE)
 - Helps understand how data is received from client (URL, body)

 REVISION NOTE:
 - @RestController → for REST APIs (returns data, not views)
 - Mapping annotations decide HTTP method
 - @RequestParam → query parameter
 - @PathVariable → URL path value
 - @RequestBody → JSON → Java object
*/

@RestController  // Combination of @Controller + @ResponseBody
// @Controller → marks class as controller
// @ResponseBody → return value is sent directly as response (JSON/String)
public class EmployeeController {

    // ================== GET ==================

    // Handles HTTP GET request
    // Used to fetch data from server
    // URL: http://localhost:8080/getEmployee
    @GetMapping("/getEmployee")
    public String getEmployee() {
        // Returning simple String as response
        return "employee";
    }

    // GET request with query parameter
    // URL: http://localhost:8080/getEmployeeById?employeeId=101
    @GetMapping("/getEmployeeById")
    public String getEmployeeById(
            // @RequestParam → extracts value from query string
            @RequestParam Integer employeeId) {

        // employeeId value comes from URL
        return "employee";
    }

    // GET request with path variable
    // URL: http://localhost:8080/getEmployeeByPathId/101
    @GetMapping("/getEmployeeByPathId/{id}")
    public String getEmployeeByPathId(
            // @PathVariable → extracts value from URL path
            // name="id" → matches {id} in URL
            @PathVariable(name = "id") Integer employeeId) {

        return "employee";
    }

    // ================== POST ==================

    // Handles HTTP POST request
    // Used to create new resource
    // Expects JSON body from client
    @PostMapping("/addEmployee")
    public String addEmployee(
            // @RequestBody → converts JSON request into Employee object
            @RequestBody Employee employee) {

        // employee object is created automatically by Spring
        return "added";
    }

    // ================== PUT ==================

    // Handles HTTP PUT request
    // Used to update existing resource
    @PutMapping("/updateEmployee")
    public String updateEmployee(
            // Usually @RequestBody is also used here
            Employee employee) {

        return "updated";
    }

    // ================== DELETE ==================

    // Handles HTTP DELETE request
    // Used to delete resource
    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(
            // Can also accept ID or request body
            Employee employee) {

        return "deleted";
    }
}
