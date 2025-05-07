package com.example.btvn8.controller;

import com.example.btvn8.base.RestApiV1;
import com.example.btvn8.base.VsReponseUtil;
import com.example.btvn8.constant.UrlConstant;
import com.example.btvn8.domain.dto.request.employee.CreateEmployeeDTO;
import com.example.btvn8.domain.dto.request.position.CreatePositionDTO;
import com.example.btvn8.service.EmployeeService;
import com.example.btvn8.service.PositionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestApiV1
@RequestMapping("/employee")
@RequiredArgsConstructor

public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(UrlConstant.Employee.GET_EMPLOYEES)
    public ResponseEntity<?> getAll(){
        return VsReponseUtil.success(employeeService.getAllEmployee());
    }

    @PostMapping(UrlConstant.Employee.CREATE_EMPLOYEE)
    public ResponseEntity<?> createEmployee(@Valid @RequestBody CreateEmployeeDTO createEmployeeDTO){
        return VsReponseUtil.success(employeeService.createEmployee(createEmployeeDTO));
    }

    @PostMapping(UrlConstant.Employee.UPDATE_EMPLOYEE)
    public ResponseEntity<?> updateEmployee(@PathVariable String id){
        return VsReponseUtil.success(employeeService.updateEmployee(id));
    }

    @DeleteMapping(UrlConstant.Employee.DELETE_EMPLOYEE)
    public ResponseEntity<?> deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return VsReponseUtil.success("Deleted successfully");
    }
}
