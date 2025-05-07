package com.example.btvn8.service.impl;

import com.example.btvn8.constant.ErrorMessage;
import com.example.btvn8.domain.dto.reponse.EmployeeReponseDTO;
import com.example.btvn8.domain.dto.request.employee.CreateEmployeeDTO;
import com.example.btvn8.domain.entity.Employee;
import com.example.btvn8.domain.mapper.EmployeeMapper;
import com.example.btvn8.exception.NotFoundException;
import com.example.btvn8.repository.EmployeeRepository;
import com.example.btvn8.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeReponseDTO> getAllEmployee() {
        return employeeMapper.toEmployeeReponseDTOList((List<Employee>) employeeRepository.findAll());
    }

    @Override
    public EmployeeReponseDTO createEmployee(CreateEmployeeDTO createEmployeeDTO) {
        Employee employee = employeeMapper.toEmployee(createEmployeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toEmployeeReponseDTO(savedEmployee);
    }

    @Override
    public EmployeeReponseDTO updateEmployee(String id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Employee.ERR_NOT_FOUND_EMPLOYEE,new String[]{id}));
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toEmployeeReponseDTO(savedEmployee);
    }

    @Override
    public void deleteEmployee(String id) {
        if(employeeRepository.existsById(id)) {
            throw new NotFoundException(ErrorMessage.Employee.ERR_NOT_FOUND_EMPLOYEE, new String[]{id});
        }
        employeeRepository.deleteById(id);
    }
}
