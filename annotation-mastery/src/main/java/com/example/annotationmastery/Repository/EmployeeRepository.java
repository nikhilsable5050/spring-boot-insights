package com.example.annotationmastery.Repository;

import org.springframework.stereotype.Repository;

/*
 PURPOSE:
 - This class represents the Data Access Layer (DAO)
 - Responsible for interacting with database
 - Contains DB-related logic only (no business logic)

 REVISION NOTE:
 - @Repository marks this class as Repository layer
 - Spring manages this class as a bean
 - Translates DB exceptions into Spring exceptions
*/

@Repository   // Indicates this class handles database operations
public class EmployeeRepository {

    // Fetch employee data from database
    public String getEmployee() {

        // DB operation happens here
        // Example (future): select * from employee where id = ?
        // Currently returning dummy data for learning purpose

        return "employee";
    }
}
