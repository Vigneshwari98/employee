package org.venkat.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.venkat.model.Employee;
import org.venkat.service.EmployeeService;

public class EmployeeController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        String id = req.getParameter("userId");
        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.getEmployeeDetails(id);
    }
}
