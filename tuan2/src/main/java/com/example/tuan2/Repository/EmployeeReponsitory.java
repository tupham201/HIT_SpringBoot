package com.example.tuan2.Repository;

import com.example.tuan2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee, Long> {}
