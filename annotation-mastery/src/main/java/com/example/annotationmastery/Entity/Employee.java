package com.example.annotationmastery.Entity;

/*
 PURPOSE:
 - This class represents Employee data
 - Used as a Model / Entity to transfer data between client & server
 - Acts as a blueprint for Employee object

 REVISION NOTE:
 - Fields represent properties of Employee
 - Used with @RequestBody to receive JSON data
 - JSON keys must match field names
*/

public class Employee {

    // Employee name
    // Example JSON: "name": "Nikhil"
    private String name;

    // Unique ID of employee
    // Example JSON: "employeeId": 101
    private Integer employeeId;

    // Department where employee works
    // Example JSON: "department": "IT"
    private String department;

    // ================== GETTERS & SETTERS ==================
    // Required for Spring to convert JSON → Java Object

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Assigns value coming from request to class variable
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
