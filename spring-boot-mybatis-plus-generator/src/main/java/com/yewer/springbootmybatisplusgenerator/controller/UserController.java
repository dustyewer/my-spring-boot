package com.yewer.springbootmybatisplusgenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @GetMapping("getwrapper")
    public List<User> getWrapper(String userName) {
        Wrapper<User> queryWrapper = new QueryWrapper<User>().like("user_name", userName);
        return UserService.list(queryWrapper);
    }

    @GetMapping("getpage")
    public Page<Map<String, Object>> getMap(String userName) {
        Page<Map<String, Object>> page = new Page<Map<String, Object>>(1, 2);
        Wrapper<User> queryWrapper = new QueryWrapper<User>().like("user_name", userName);
        return UserService.pageMaps(page, queryWrapper);
    }

}
