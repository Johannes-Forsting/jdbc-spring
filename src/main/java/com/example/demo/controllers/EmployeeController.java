package com.example.demo.controllers;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CRUDInterface;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Controller
public class EmployeeController {
    private CRUDInterface<Department> departmentRepository = new DepartmentRepository();

    @GetMapping("/employees")
    public String allEmployees(Model model){
        EmployeeRepository employee = new EmployeeRepository();
        ArrayList<Employee> employees = employee.getAllEntities();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @RequestMapping("/findEmployee")
    public String findEmployeeByID(WebRequest dataFromForm, Model employeesByID){

        int employeeID = 0;
        try {
            employeeID = Integer.parseInt(dataFromForm.getParameter("ID"));
            System.out.println(employeeID);
        }
        catch (Exception e){

        }
        Employee employeeByID = new Employee(2, "test", "test", 2, "1980-12-17", 2, 2, 2);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employeeByID);
        employeesByID.addAttribute("employeesByID", employees);
        return "findEmployee";
    }


}
