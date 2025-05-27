package com.example.online.service;

import com.example.online.domain.dto.reponse.UserReponseDTO;
import com.example.online.domain.dto.request.CreateUserDTO;

import java.util.List;

public interface UserService {
    //Lấy tất cả người dùng
    List<UserReponseDTO> getAllUser();

    //Lấy người dùng bằng id
    UserReponseDTO getUserById(String id);

    //Khởi tạo người dùng
    UserReponseDTO createUser(CreateUserDTO createUserDTO);

}
