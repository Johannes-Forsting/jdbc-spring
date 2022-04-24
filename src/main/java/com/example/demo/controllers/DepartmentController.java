package com.example.demo.controllers;

import com.example.demo.models.Department;
import com.example.demo.repositories.CRUDInterface;
import com.example.demo.repositories.DepartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class DepartmentController {
    private CRUDInterface<Department> departmentRepository = new DepartmentRepository();

    @GetMapping("/departments")
    public String allDepartments(Model model){
        DepartmentRepository department = new DepartmentRepository();
        ArrayList<Department> departments = department.getAllEntities();
        model.addAttribute("departments", departments);
        return "departments";
    }
}
