package com.example.employeemanagement.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Department {

    @Id
    @Column(name = "deptId")
    private Long departmentID;

    @Column(name = "deptNamr")
    private String deptName;

    @ManyToOne
    @JoinColumn(name="empId", nullable=false)
    private Employee employee;

    public Department() { }

    public Department(Long departmentID, String deptName, Employee employee) {
        this.departmentID = departmentID;
        this.deptName = deptName;
        this.employee = employee;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
