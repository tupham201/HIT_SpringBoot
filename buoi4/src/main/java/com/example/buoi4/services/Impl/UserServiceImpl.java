package com.example.buoi4.services.Impl;

import com.example.buoi4.models.User;
import com.example.buoi4.repository.UserRepository;
import com.example.buoi4.services.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}