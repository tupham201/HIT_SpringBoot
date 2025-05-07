package com.example.btvn8.service;

import com.example.btvn8.domain.dto.reponse.DepartmentReponseDTO;
import com.example.btvn8.domain.dto.request.department.CreateDepartmentDTO;

import java.util.List;

public interface DepartmentService {
    List<DepartmentReponseDTO> getAllDepartments();
    DepartmentReponseDTO createDepartment(CreateDepartmentDTO createDepartmentDTO);
    DepartmentReponseDTO updateDepartment(String id);
    void deleteDepartment(String id);
}
