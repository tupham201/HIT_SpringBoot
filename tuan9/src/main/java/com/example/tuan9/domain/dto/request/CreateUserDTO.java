package com.example.tuan9.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CreateUserDTO {
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9].{6,}")
    private String username;

    @NotBlank
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,}$")
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;
}
