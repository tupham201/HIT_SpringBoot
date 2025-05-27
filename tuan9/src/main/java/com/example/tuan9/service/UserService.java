package com.example.tuan9.service;

import com.example.tuan9.domain.dto.request.LoginRequestDTO;
import com.example.tuan9.domain.dto.request.CreateUserDTO;
import com.example.tuan9.domain.dto.response.UserResponseDTO;
import com.example.tuan9.domain.entity.User;

import java.util.List;

public interface UserService {
    UserResponseDTO register(CreateUserDTO createUserDTO);
    UserResponseDTO login(LoginRequestDTO loginRequestDTO);
    List<UserResponseDTO> getAllUsers();
}
