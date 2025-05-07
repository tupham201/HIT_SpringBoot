package com.example.btvn8.domain.mapper;

import com.example.btvn8.domain.dto.reponse.EmployeeReponseDTO;
import com.example.btvn8.domain.dto.request.employee.CreateEmployeeDTO;
import com.example.btvn8.domain.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEmployee(CreateEmployeeDTO createEmployeeDTO);
    EmployeeReponseDTO toEmployeeReponseDTO(Employee employee);
    List<EmployeeReponseDTO> toEmployeeReponseDTOList(List<Employee> employees);
}
