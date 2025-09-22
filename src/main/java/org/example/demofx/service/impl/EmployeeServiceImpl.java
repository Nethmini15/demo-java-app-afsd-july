package org.example.demofx.service.impl;

import org.example.demofx.db.Database;
import org.example.demofx.dto.EmployeeDto;
import org.example.demofx.entity.Employee;
import org.example.demofx.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {
        Database.employees.add(new Employee(employeeDto.getId(), employeeDto.getName(),
                employeeDto.getAddress(), employeeDto.getPosition()));
        return true;
    }
}
