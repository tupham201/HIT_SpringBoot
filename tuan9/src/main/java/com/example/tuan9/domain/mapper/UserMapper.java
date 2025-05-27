package com.example.tuan9.domain.mapper;

import com.example.tuan9.domain.dto.request.CreateUserDTO;
import com.example.tuan9.domain.dto.response.UserResponseDTO;
import com.example.tuan9.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDTO toUserResponseDTO(User user);
    User toUser(CreateUserDTO createUserDTO);
}
