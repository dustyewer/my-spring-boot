package com.yewer.springbootmybatismulidatasource.controller;

import java.util.List;

import javax.annotation.Resource;

import com.yewer.springbootmybatismulidatasource.entity.User;
import com.yewer.springbootmybatismulidatasource.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Resource(name = "user1Service")
    UserService user1Service;

    @Resource(name = "user2Service")
    UserService user2Service;

    @GetMapping("/user1")
    public User getUser1ById(String id) {
        return user1Service.getUserById(id);
    }

    @GetMapping("/user2")
    public User getUser2ById(String id) {
        return user2Service.getUserById(id);
    }

}
