package yewer.springbootmybatisplusmulidatasource.controller;

import java.util.List;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import yewer.springbootmybatisplusmulidatasource.mapper.UserMapper;
import yewer.springbootmybatisplusmulidatasource.model.User;
import yewer.springbootmybatisplusmulidatasource.service.UserService;

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

    @DS("ds")
    @GetMapping("/user2")
    public User getUserById2(String id) {
        return userService.getById(id);
    }

}
