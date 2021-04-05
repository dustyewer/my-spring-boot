package com.yewer.vueandjpa.controller;

import com.yewer.vueandjpa.entity.User;
import com.yewer.vueandjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserRepository userRepository;


    @GetMapping("/user")
    public List<User> getUser(){
        return userRepository.findAll();

    }
}
