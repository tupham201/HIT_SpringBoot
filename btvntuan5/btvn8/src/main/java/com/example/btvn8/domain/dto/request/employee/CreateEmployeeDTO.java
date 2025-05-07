package com.example.btvn8.domain.dto.request.employee;

import com.example.btvn8.domain.entity.Department;
import com.example.btvn8.domain.entity.Position;
import com.example.btvn8.domain.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CreateEmployeeDTO {
    @NotNull
    private User user;
    @NotNull
    private Department department;
    @NotNull
    private Position position;
    @NotNull
    private String fullName;
    @NotNull
    private LocalDate dateOfBirth;
    @NotNull
    private LocalTime hiredDate;
    @NotBlank
    private BigDecimal salary;
}
