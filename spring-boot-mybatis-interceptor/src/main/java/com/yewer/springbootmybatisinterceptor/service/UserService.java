package com.yewer.springbootmybatisinterceptor.service;

import java.util.List;

import com.yewer.springbootmybatisinterceptor.common.Page;
import com.yewer.springbootmybatisinterceptor.model.User;

public interface UserService {

    public User getUserById(Long id);

    public List<User> getAllUser();

    public List<User> getUserPage(Page page);


}
