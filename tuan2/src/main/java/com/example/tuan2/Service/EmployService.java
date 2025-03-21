package com.example.tuan2.Service;

import com.example.tuan2.Entity.Employee;
import com.example.tuan2.Repository.EmployeeReponsitory;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {
    private EmployeeReponsitory employeeReponsitory;
    public EmployService(EmployeeReponsitory employeeReponsitory) {
        this.employeeReponsitory = employeeReponsitory;
    }

    public List<Employee> getAllEmployee(){
        return employeeReponsitory.findAll();
    }

    @Transactional
    public void addEmployee(Employee employee){
        employeeReponsitory.save(employee);
    }
}
