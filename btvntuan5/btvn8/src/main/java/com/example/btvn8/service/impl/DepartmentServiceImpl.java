package com.example.btvn8.service.impl;

import com.example.btvn8.constant.ErrorMessage;
import com.example.btvn8.domain.dto.reponse.DepartmentReponseDTO;
import com.example.btvn8.domain.dto.request.department.CreateDepartmentDTO;
import com.example.btvn8.domain.entity.Department;
import com.example.btvn8.domain.mapper.DepartmentMapper;
import com.example.btvn8.exception.NotFoundException;
import com.example.btvn8.repository.DepartmentRepository;
import com.example.btvn8.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    @Override
    public List<DepartmentReponseDTO> getAllDepartments() {
        return departmentMapper.toDepartmentReponseDTOList(departmentRepository.findAll());
    }

    @Override
    public DepartmentReponseDTO createDepartment(CreateDepartmentDTO createDepartmentDTO) {
        Department department = departmentMapper.toDepartment(createDepartmentDTO);
        Department savedDepartment = departmentRepository.save(department);
        return departmentMapper.toDepartmentReponseDTO(savedDepartment);
    }

    @Override
    public DepartmentReponseDTO updateDepartment(String id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_DEPARTMENT,new String[]{id}));
        Department savedDepartment = departmentRepository.save(department);
        return departmentMapper.toDepartmentReponseDTO(savedDepartment);
    }

    @Override
    public void deleteDepartment(String id) {
        if(departmentRepository.existsById(id)) {
            throw new NotFoundException(ErrorMessage.Department.ERR_NOT_FOUND_DEPARTMENT, new String[]{id});
        }
        departmentRepository.deleteById(id);
    }


}
