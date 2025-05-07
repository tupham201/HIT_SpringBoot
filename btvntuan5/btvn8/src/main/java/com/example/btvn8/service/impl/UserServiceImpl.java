package com.example.btvn8.service.impl;

import com.example.btvn8.constant.ErrorMessage;
import com.example.btvn8.domain.dto.reponse.UserReponseDTO;
import com.example.btvn8.domain.dto.request.user.CreateUserDTO;
import com.example.btvn8.domain.entity.User;
import com.example.btvn8.domain.mapper.UserMapper;
import com.example.btvn8.exception.NotFoundException;
import com.example.btvn8.repository.UserRepository;
import com.example.btvn8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserReponseDTO> getAllUsers() {
        return userMapper.toUserList(userRepository.findAll());
    }

    @Override
    public UserReponseDTO createUser(CreateUserDTO createUserDTO) {
        User user = userMapper.toUser(createUserDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toUserReponseDTO(savedUser);
    }

    @Override
    public UserReponseDTO updateUser(String id) {
        User exitUser = userRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_USER,new String[]{id}));
        User savedUser = userRepository.save(exitUser);
        return userMapper.toUserReponseDTO(savedUser);
    }


    @Override
    public void deleteUser(String id) {
        if(userRepository.existsById(id)){
            throw new NotFoundException(ErrorMessage.User.ERR_NOT_FOUND_USER,new String[]{id});
        }
        userRepository.deleteById(id);
    }
}
