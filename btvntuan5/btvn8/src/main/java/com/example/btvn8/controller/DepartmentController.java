package com.example.btvn8.controller;

import com.example.btvn8.base.RestApiV1;
import com.example.btvn8.base.VsReponseUtil;
import com.example.btvn8.constant.UrlConstant;
import com.example.btvn8.domain.dto.request.department.CreateDepartmentDTO;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;
import com.example.btvn8.repository.DepartmentRepository;
import com.example.btvn8.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApiV1
@RequestMapping("/department")
@RequiredArgsConstructor

public class DepartmentController {
    private final DepartmentService departmentService;
    @GetMapping(UrlConstant.Department.GET_DEPARTMENTS)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(departmentService.getAllDepartments());
    }

    @PostMapping(UrlConstant.Department.CREATE_DEPARTMENT)
    public ResponseEntity<?> createDepartment(@Valid @RequestBody CreateDepartmentDTO createDepartmentDTO){
        return VsReponseUtil.success(departmentService.createDepartment(createDepartmentDTO));
    }

    @PostMapping(UrlConstant.Department.UPDATE_DEPARTMENT)
    public ResponseEntity<?> updateDepartment(@PathVariable String id){
        return VsReponseUtil.success(departmentService.updateDepartment(id));
    }

    @DeleteMapping(UrlConstant.Department.DELETE_DEPARTMENT)
    public ResponseEntity<?> deleteDepartment(@PathVariable String id){
        departmentService.deleteDepartment(id);
        return VsReponseUtil.success("Deleted successfully");
    }
}
