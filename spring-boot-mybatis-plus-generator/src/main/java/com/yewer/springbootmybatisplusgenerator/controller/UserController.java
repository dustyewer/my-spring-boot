package com.yewer.springbootmybatisplusgenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.yewer.springbootmybatisplusgenerator.entity.User;
import com.yewer.springbootmybatisplusgenerator.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yewer
 * @since 2021-02-27
 */
@RestController
@RequestMapping("/springbootmybatisplusgenerator/user")
public class UserController {

    @Autowired
    UserService UserService;

    @GetMapping(value = "getall")
    public List<User> getAll() {
        return UserService.list();
    }

}
