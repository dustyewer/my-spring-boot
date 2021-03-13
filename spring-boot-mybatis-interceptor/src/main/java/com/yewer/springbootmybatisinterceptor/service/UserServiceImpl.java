package com.yewer.springbootmybatisinterceptor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yewer.springbootmybatisinterceptor.common.Page;
import com.yewer.springbootmybatisinterceptor.dao.UserMapper;
import com.yewer.springbootmybatisinterceptor.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> getUserPage(Page page) {

        return userMapper.selectPage(page);
    }

}
