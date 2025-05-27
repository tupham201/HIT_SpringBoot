package com.example.buoi4.services;

import com.example.buoi4.models.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(User user);
}