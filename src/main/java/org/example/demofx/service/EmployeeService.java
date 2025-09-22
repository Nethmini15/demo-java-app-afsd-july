package org.example.demofx.service;

import org.example.demofx.dto.EmployeeDto;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDto employeeDto); // <--- this is a abstract method have in interface
}
