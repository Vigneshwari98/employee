package org.venkat.service;

import org.venkat.model.Employee;
import org.venkat.repository.EmployeeRepository;

public class EmployeeService {
    public Employee getEmployeeDetails(String id){
        EmployeeRepository employeeRepository = new EmployeeRepository();
        return employeeRepository.getEmployeeDetails(id);
    }
}
