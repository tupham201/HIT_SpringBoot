package com.example.online.domain.dto.reponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserReponseDTO {

    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
