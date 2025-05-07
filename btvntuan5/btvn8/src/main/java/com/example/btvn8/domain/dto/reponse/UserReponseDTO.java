package com.example.btvn8.domain.dto.reponse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class UserReponseDTO {
    private String id;
    private String username;
    private String password;
    private String email;
    private LocalDate created_at;
}
