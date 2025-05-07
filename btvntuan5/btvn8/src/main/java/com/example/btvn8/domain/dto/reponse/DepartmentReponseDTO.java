package com.example.btvn8.domain.dto.reponse;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DepartmentReponseDTO {
    private String id;
    private String name;
    private String description;
}
