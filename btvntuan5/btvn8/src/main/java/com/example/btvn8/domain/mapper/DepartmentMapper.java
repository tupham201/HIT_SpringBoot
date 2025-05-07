package com.example.btvn8.domain.mapper;

import com.example.btvn8.domain.dto.reponse.DepartmentReponseDTO;
import com.example.btvn8.domain.dto.request.department.CreateDepartmentDTO;
import com.example.btvn8.domain.entity.Department;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toDepartment(CreateDepartmentDTO createDepartmentDTO);
    DepartmentReponseDTO toDepartmentReponseDTO(Department department);
    List<DepartmentReponseDTO> toDepartmentReponseDTOList(List<Department> departments);

}
