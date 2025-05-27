package com.example.tuan8.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponeDTO
{
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
