package com.yewer.springbootaop.mapper;

import com.yewer.springbootaop.model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

    public User getUser(String id) {
        User user = new User();
        user.setId(id);
        user.setName("yewer");
        return user;

    }

}
