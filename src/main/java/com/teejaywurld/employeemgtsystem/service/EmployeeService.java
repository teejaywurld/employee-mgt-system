package com.teejaywurld.employeemgtsystem.service;

import com.teejaywurld.employeemgtsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    boolean deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
