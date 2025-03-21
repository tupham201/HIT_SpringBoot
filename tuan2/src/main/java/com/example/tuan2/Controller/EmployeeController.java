package com.example.tuan2.Controller;

import com.example.tuan2.Entity.Employee;
import com.example.tuan2.Service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployService employService;

    @Autowired
    public EmployeeController(EmployService employService) {
        this.employService = employService;
    }

    @GetMapping("/employees")
    public String getEmployees(Model model) {
        List<Employee> employees = employService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employees";
    }

}
