package com.example.demo.repositories;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.utility.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements CRUDInterface<Employee>{

    @Override
    public boolean create(Employee entity) {
        return false;
    }

    @Override
    public Employee getSingleEntityById() {
        return null;
    }

    @Override
    public ArrayList<Employee> getAllEntities() {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        try {
            Connection conn = DatabaseConnectionManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employees");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String employeeName = rs.getString("employee_Name");
                String job = rs.getString("job");
                int manager = rs.getInt("manager");
                String hireDate = rs.getString("hiredate");
                int salary = rs.getInt("salary");
                int commision = rs.getInt("commission");
                int departmentNumber = rs.getInt("department_number");
                Employee currentEmployee = new Employee(id, employeeName, job, manager, hireDate, salary, commision, departmentNumber);
                employees.add(currentEmployee);
            }

        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Something wrong with database");
        }
        return employees;
    }

    @Override
    public boolean update(Employee entity) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
