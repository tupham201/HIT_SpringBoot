package com.example.btvn8.domain.mapper;


import com.example.btvn8.domain.dto.reponse.UserReponseDTO;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;
import com.example.btvn8.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
   User toUser(CreateUserDTO createUserDTO);
   UserReponseDTO toUserReponseDTO(User user);
   List<UserReponseDTO> toUserList(List<User> UserList);
}
