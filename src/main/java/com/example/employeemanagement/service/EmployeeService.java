package com.example.employeemanagement.service;


import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee employee);

    public List<Employee> getEmployee();

    public Employee getEmployee(Long empId) throws Exception;

    public void deleteEmployee(Long empId);

    public List<Department> getDepartments(Long empId);
}
