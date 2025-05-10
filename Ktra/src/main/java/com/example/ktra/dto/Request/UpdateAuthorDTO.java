package com.example.ktra.dto.Request;

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


public class UpdateAuthorDTO {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private String Bio;
}
