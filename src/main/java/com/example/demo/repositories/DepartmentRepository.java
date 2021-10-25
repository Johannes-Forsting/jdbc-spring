package com.example.demo.repositories;

import com.example.demo.models.Department;
import com.example.demo.utility.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;


public class  DepartmentRepository {
    DatabaseConnectionManager dbConnect = new DatabaseConnectionManager();

    public ArrayList<Department> getAllDepartments(){
        ArrayList<Department> allDepartments = new ArrayList<Department>();
        try {
            PreparedStatement stmt = dbConnect.getConnection().prepareStatement("SELECT * FROM departments");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Department tmp = new Department(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                );
                allDepartments.add(tmp);
            }
        }
        catch(SQLException e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
        return allDepartments;
    }
}