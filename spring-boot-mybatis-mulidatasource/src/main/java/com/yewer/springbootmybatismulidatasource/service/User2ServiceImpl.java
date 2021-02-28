package com.yewer.springbootmybatismulidatasource.service;

import com.yewer.springbootmybatismulidatasource.mapper.ds2.User2Mapper;
import com.yewer.springbootmybatismulidatasource.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("user2Service")
public class User2ServiceImpl implements UserService {

    @Autowired
    User2Mapper user2Mapper;

    @Override
    public User getUserById(String id) {
        return user2Mapper.selectByPrimaryKey(Long.valueOf(id));
    }

}
