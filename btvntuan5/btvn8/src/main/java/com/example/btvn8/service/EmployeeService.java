package com.example.btvn8.service;

import com.example.btvn8.domain.dto.reponse.EmployeeReponseDTO;
import com.example.btvn8.domain.dto.request.employee.CreateEmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeReponseDTO> getAllEmployee();
    EmployeeReponseDTO createEmployee(CreateEmployeeDTO createEmployeeDTO);
    EmployeeReponseDTO updateEmployee(String id);
    void deleteEmployee(String id);
}
