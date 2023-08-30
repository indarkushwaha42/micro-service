package com.example.UserService.controller;

import com.example.UserService.model.User;
import com.example.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userApi")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId){
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }
    @PutMapping("{userId}")
    public ResponseEntity<User> updateUser(@PathVariable("userId") String userId, @RequestBody User user){
        return new ResponseEntity<>(userService.updateUser(userId, user), HttpStatus.OK);
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId") String userId){
        return new ResponseEntity<>("user deleted successfully", HttpStatus.OK);

    }
}
