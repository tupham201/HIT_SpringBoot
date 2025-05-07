package com.example.btvn8.service;

import com.example.btvn8.domain.dto.reponse.UserReponseDTO;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;

import java.util.List;

public interface UserService {
    List<UserReponseDTO> getAllUsers();
    UserReponseDTO createUser(CreateUserDTO createUserDTO);
    UserReponseDTO updateUser(String id);
    void deleteUser(String id);
}
