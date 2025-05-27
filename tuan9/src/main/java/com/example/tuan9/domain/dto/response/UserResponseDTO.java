package com.example.tuan9.domain.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponseDTO {
    private String id;
    private String username;
    private String firstName;
    private String lastname;
}
