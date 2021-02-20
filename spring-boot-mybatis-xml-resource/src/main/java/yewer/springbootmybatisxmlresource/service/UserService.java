package yewer.springbootmybatisxmlresource.service;

import java.util.List;

import yewer.springbootmybatisxmlresource.model.User;

public interface UserService {

    public User getUserById(Long id);

    public User getUserByName(String name);

    public User getUserByNameAndSex(String name, String sex);

    public List<User> getAllUser();

    public int insertUser(User user);

}
