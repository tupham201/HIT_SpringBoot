package com.example.online.domain.mapper;

import com.example.online.domain.dto.reponse.UserReponseDTO;
import com.example.online.domain.dto.request.CreateUserDTO;
import com.example.online.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(CreateUserDTO createUserDTO);
    UserReponseDTO toUserReponseDTO(User user);
    List<UserReponseDTO> toUserReponseDTO(List<User> users);
}
