package com.example.demo.models;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String employeeName;
    private String job;
    private int manager;
    private LocalDate hireDate;
    private int salary;
    private int commision;
    private int departmentNumber;

    public Employee(int id, String employeeName, String job, int manager, String hireDate, int salary, int commision, int departmentNumber) {
        this.id = id;
        this.employeeName = employeeName;
        this.job = job;
        this.manager = manager;
        this.hireDate = LocalDate.parse(hireDate);
        this.salary = salary;
        this.commision = commision;
        this.departmentNumber = departmentNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = LocalDate.parse(hireDate);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", job='" + job + '\'' +
                ", manager=" + manager +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", commision=" + commision +
                ", departmentNumber=" + departmentNumber +
                '}';
    }
}