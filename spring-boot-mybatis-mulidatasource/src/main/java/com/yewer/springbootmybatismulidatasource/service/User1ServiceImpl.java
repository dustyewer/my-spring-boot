package com.yewer.springbootmybatismulidatasource.service;

import com.yewer.springbootmybatismulidatasource.mapper.ds1.User1Mapper;
import com.yewer.springbootmybatismulidatasource.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user1Service")
public class User1ServiceImpl implements UserService {

    @Autowired
    User1Mapper user1Mapper;

    @Override
    public User getUserById(String id) {

        return user1Mapper.selectByPrimaryKey(Long.valueOf(id));
    }

}
