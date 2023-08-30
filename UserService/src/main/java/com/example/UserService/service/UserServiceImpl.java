package com.example.UserService.service;

import com.example.UserService.exception.ResourceNotFoundException;
import com.example.UserService.model.User;
import com.example.UserService.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found with given id"+userId));
    }

    @Override
    public User updateUser(String userId, User user) {
        User existingUser = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found with given id"+userId));
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAbout(user.getAbout());
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public void deleteUser(String userId) {

        userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user not found with given id"+userId));
        userRepository.deleteById(userId);

    }
}
