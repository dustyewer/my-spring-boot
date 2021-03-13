package com.yewer.springbootmybatisinterceptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yewer.springbootmybatisinterceptor.common.Page;
import com.yewer.springbootmybatisinterceptor.model.User;
import com.yewer.springbootmybatisinterceptor.service.UserService;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "user")
    public Object getUser(String id) {
        return userService.getUserById(Long.valueOf(id));
    }

    @GetMapping(value = "alluser")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping(value = "users")
    public List<User> getUsers(int page, int rows) {
        Page userPage = new Page();
        userPage.setPage(page);
        userPage.setRows(rows);
        return userService.getUserPage(userPage);
    }
}
