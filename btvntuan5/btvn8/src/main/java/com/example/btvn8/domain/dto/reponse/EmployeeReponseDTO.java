package com.example.btvn8.domain.dto.reponse;

import com.example.btvn8.domain.entity.Department;
import com.example.btvn8.domain.entity.Position;
import com.example.btvn8.domain.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

public class EmployeeReponseDTO {
    private String id;
    private User user;
    private Department department;
    private Position position;
    private String fullName;
    private LocalDate dateOfBirth;
    private LocalTime hiredDate;
    private BigDecimal salary;
}
