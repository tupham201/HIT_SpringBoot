package com.example.demo.reponsitory;

import com.example.demo.controller.CRUD_employees;
import com.example.demo.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesReponsitory extends JpaRepository<Employees, Integer> {

}
