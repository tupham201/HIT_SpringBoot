package com.example.demo.controller;

import com.example.demo.reponsitory.EmployeesReponsitory;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/employees")
public class CRUD_employees {
    private EmployeesReponsitory employeesReponsitory;

}
