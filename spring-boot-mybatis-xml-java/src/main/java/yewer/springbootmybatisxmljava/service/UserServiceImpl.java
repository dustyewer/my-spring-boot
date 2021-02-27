package yewer.springbootmybatisxmljava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yewer.springbootmybatisxmljava.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Object getUser(String id) {
        return userMapper.selectByPrimaryKey(Long.valueOf(id));
    }
    
}
