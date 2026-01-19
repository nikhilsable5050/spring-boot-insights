package com.example.annotationmastery.Service;

import org.springframework.stereotype.Service;

/*
 PURPOSE:
 - This class represents the Service layer
 - Contains business logic of the application
 - Acts as a bridge between Controller and Repository

 REVISION NOTE:
 - @Service marks this class as Service layer
 - Spring creates and manages its object (Bean)
 - Controller should call Service, NOT Repository directly
*/

@Service   // Indicates this class contains business logic
public class EmployeeService {

    // Business logic method to get employee
    public String getEmployee() {

        // Here we can:
        // - apply validations
        // - apply business rules
        // - call repository for DB operations

        return "employee";
    }
}
