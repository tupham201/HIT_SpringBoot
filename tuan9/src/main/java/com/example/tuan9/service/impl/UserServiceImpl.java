package com.example.tuan9.service.impl;

import com.example.tuan9.constant.ErrorMessage;
import com.example.tuan9.domain.dto.request.LoginRequestDTO;
import com.example.tuan9.domain.dto.request.CreateUserDTO;
import com.example.tuan9.domain.dto.response.UserResponseDTO;
import com.example.tuan9.domain.entity.User;
import com.example.tuan9.domain.mapper.UserMapper;
import com.example.tuan9.exception.BadLoginEx;
import com.example.tuan9.exception.NotFoundException;
import com.example.tuan9.repository.UserRepository;
import com.example.tuan9.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDTO register(CreateUserDTO createUserDTO) {
        User user = userMapper.toUser(createUserDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        return userMapper.toUserResponseDTO(savedUser);
    }

    @Override
    public UserResponseDTO login(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByUsername(loginRequestDTO.getUsername());
        if(user == null || !passwordEncoder.matches(loginRequestDTO.getPassword(),user.getPassword())){
            throw new BadLoginEx(ErrorMessage.User.USER_ALREADY_EXISTS);
        }
        return userMapper.toUserResponseDTO(user);
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::toUserResponseDTO)
                .collect(Collectors.toList());
    }
}
