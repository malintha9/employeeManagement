package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.DepartmentRepository;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository){
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return  employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long empId) throws Exception{

        Employee emp = employeeRepository.findOne(empId);
        if(Objects.isNull(emp)){
            throw new Exception();
        }

        return emp;
    }

    public void deleteEmployee(Long empId){
        employeeRepository.delete(empId);
    }

    public List<Department> getDepartments(Long empId){
        return departmentRepository.findByPostId(empId);
    }
}
