package com.example.tuan2;

import com.example.tuan2.Entity.Department;
import com.example.tuan2.Entity.Employee;
import com.example.tuan2.Repository.DepartmentRepository;
import com.example.tuan2.Service.EmployService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tuan2Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Tuan2Application.class, args);
        EmployService employService = context.getBean(EmployService.class);
        DepartmentRepository departmentRepository = context.getBean(DepartmentRepository.class);
        Department department = departmentRepository.save(new Department("1"));
        employService.addEmployee(new Employee("1","1", department));
    }
}
