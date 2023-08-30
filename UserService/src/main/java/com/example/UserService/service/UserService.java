package com.example.UserService.service;

import com.example.UserService.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUserById(String userId);
    User updateUser(String userId, User user);
    void deleteUser(String userId);
}
