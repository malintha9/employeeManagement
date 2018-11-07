package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DepartmentRepository extends CrudRepository<Department, Long>{

    List<Department> findByPostId(Long empId);
}
