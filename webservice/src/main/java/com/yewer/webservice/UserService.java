package com.yewer.webservice;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserService {
    @WebMethod
    public User getUser(String name);
}
