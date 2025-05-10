package com.example.ktra.dto.reponse;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AuthorReponseDTO {
    private String id;
    private String name;
    private Date dateOfBirth;
    private String Bio;
}
