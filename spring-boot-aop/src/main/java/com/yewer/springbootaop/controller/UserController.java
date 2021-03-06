package com.yewer.springbootaop.controller;

import com.yewer.springbootaop.model.User;
import com.yewer.springbootaop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public User getUser(String id) {
        return userService.getUser(id);
    }
}
