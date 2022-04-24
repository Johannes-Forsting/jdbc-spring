package com.example.demo.repositories;

import com.example.demo.models.Department;
import com.example.demo.utility.DatabaseConnectionManager;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class  DepartmentRepository implements CRUDInterface<Department>{
    @Override
    public boolean create(Department entity) {
        return false;
    }

    @Override
    public Department getSingleEntityById() {
        return null;
    }

    @Override
    public ArrayList<Department> getAllEntities() {
        ArrayList<Department> departments = new ArrayList<Department>();

        try {
            Connection conn = DatabaseConnectionManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM departments");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int departmentID = rs.getInt("department_number");
                String departmentName = rs.getString("department_name");
                String location = rs.getString("location");
                Department currentDepartment = new Department(departmentID, departmentName, location);
                departments.add(currentDepartment);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Something wrong with database");
        }
        return departments;
    }

    @Override
    public boolean update(Department entity) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
