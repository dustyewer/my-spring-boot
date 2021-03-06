package com.yewer.springbootaop.service.impl;

import com.yewer.springbootaop.mapper.UserMapper;
import com.yewer.springbootaop.model.User;
import com.yewer.springbootaop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String id) {
        return userMapper.getUser(id);
    }
    
}
