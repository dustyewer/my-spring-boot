package yewer.springbootmybatisxmlresource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yewer.springbootmybatisxmlresource.dao.UserMapper;
import yewer.springbootmybatisxmlresource.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Long id) {

        return userMapper.selectByPrimaryKey(id);

    }

    @Override
    public int insertUser(User user) {

        return userMapper.insert(user);

    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public User getUserByNameAndSex(String name, String sex) {
        User user = new User();
        user.setUserName(name);
        user.setUserSex(sex);
        return userMapper.selectByNameAndSex(user);
    }

    @Override
    public int updateUserById(User user) {
        
        return userMapper.updateByPrimaryKey(user);
    }

}
