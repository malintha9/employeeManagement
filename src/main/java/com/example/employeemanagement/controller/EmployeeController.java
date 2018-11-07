package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


    @PostMapping(value = "/register", produces = "application/json")
    public ResponseEntity<Employee> SaveEmployee(Employee employee){
        Employee emp = employeeService.save(employee);
        logger.info("Employee save successfully");
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> GetEmployees(){
        List<Employee>  emp = employeeService.getEmployee();
        logger.info("Employeees retrive successfully");
        return new ResponseEntity<List<Employee>>(emp, HttpStatus.ACCEPTED);
    }

    @PutMapping("/register")
    public ResponseEntity<Object> deleteEmployee(Long empId){
        employeeService.deleteEmployee(empId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }



}
