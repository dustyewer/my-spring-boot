package com.yewer.webservice;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component
@WebService(name = "userService",
        targetNamespace = "http://service.mywebservice.yewer.com",
        endpointInterface = "com.yewer.webservice.UserService",
        portName = "10000")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String name) {
        System.out.println("haha");
        return new User(name.toUpperCase());
    }
}
