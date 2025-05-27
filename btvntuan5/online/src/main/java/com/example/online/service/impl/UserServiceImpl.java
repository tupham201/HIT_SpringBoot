package com.example.online.service.impl;

import com.example.online.constant.ErrorMessage;
import com.example.online.domain.dto.reponse.UserReponseDTO;
import com.example.online.domain.dto.request.CreateUserDTO;
import com.example.online.domain.entity.User;
import com.example.online.domain.mapper.UserMapper;
import com.example.online.exception.NotFoundException;
import com.example.online.repository.UserRepository;
import com.example.online.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserReponseDTO> getAllUser() {
        return userMapper.toUserReponseDTO(userRepository.findAll());
    }

    @Override
    public UserReponseDTO getUserById(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_ID, new String[]{id}));
        return userMapper.toUserReponseDTO(user);
    }

    @Override
    public UserReponseDTO createUser(CreateUserDTO createUserDTO) {
        User user = userMapper.toUser(createUserDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toUserReponseDTO(savedUser);
    }
}
