package yewer.springbootmybatisann.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import yewer.springbootmybatisann.service.UserService;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/user")
    public Object getUser(@RequestParam("id") String id) {
        return userService.getUser(id);
    }
    
    
}
