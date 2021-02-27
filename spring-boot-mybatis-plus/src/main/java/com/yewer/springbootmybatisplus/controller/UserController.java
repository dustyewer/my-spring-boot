package com.yewer.springbootmybatisplus.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yewer.springbootmybatisplus.mapper.UserMapper;
import com.yewer.springbootmybatisplus.model.User;
import com.yewer.springbootmybatisplus.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public User getUserById(String id) {
        return userService.getById(Integer.valueOf(id).intValue());
    }

    @GetMapping("/user2")
    public User getUserById2(String id) {
        return userService.getById(id);
    }

    @GetMapping("/users")
    public java.util.List<User> getAll() {
        return userService.list();
    }

    @GetMapping(value = "/userPage")
    public IPage<User> getUserPage(int current, int size) {
        Page<User> page = new Page<>(current, size);
        // return userService.page(page);
        return userService.page(page);
    }

    @GetMapping(value = "/userMapperPage")
    public List<User> getUserMapperPage() {
        IPage<User> userPage = new Page<>(2, 2);// 参数一是当前页，参数二是每页个数
        userPage = userMapper.selectPage(userPage, null);
        return userPage.getRecords();
    }

}
