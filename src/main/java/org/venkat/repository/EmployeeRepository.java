package org.venkat.repository;

import org.venkat.model.Employee;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeRepository {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/employees";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public Employee getEmployeeDetails(String id){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
