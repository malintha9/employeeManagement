package com.example.employeemanagement.service;


import com.example.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee employee);

    public List<Employee> getEmployee();

    public Employee getEmployee(Long empId);
}
