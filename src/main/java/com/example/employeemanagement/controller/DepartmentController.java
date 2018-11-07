package com.example.employeemanagement.controller;


import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/department")
public class DepartmentController {


    private EmployeeService employeeService;

    @Autowired
    public DepartmentController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/emp/{empId}/dept")
    public ResponseEntity<List<Department>> getAllDeparment(@PathVariable Long empId){
        List<Department> dept = employeeService.getDepartments(empId);
        return new ResponseEntity<List<Department>>(dept, HttpStatus.ACCEPTED);
    }

}
