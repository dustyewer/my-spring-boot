package yewer.springbootmybatisdruid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yewer.springbootmybatisdruid.mapper.UserMapper;
import yewer.springbootmybatisdruid.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String id) {
      
        return userMapper.selectByPrimaryKey(Long.valueOf(id));
    }
    
}
