package yewer.springbootmybatisxmlresource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import yewer.springbootmybatisxmlresource.model.User;
import yewer.springbootmybatisxmlresource.service.UserService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // localhost:8080/user?id=1
    @GetMapping(value = "user")
    public Object getUser(String id) {
        return userService.getUserById(Long.valueOf(id));
    }

    // localhost:8080/user/1
    @GetMapping(value = "user/{id}")
    public Object getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    // localhost:8080/username?name2=yew 和第一种写法很类似,但是指定参数的名字和实际参数的名字不一样
    // @RequestParam注解还可以允许用户不输入参数时，使用默认值
    // @RequestParam(value="name2",required = false,defaultValue = "yew")
    @GetMapping(value = "username")
    // public Object getMethodName(@RequestParam(value = "name2") String name) {
    public Object getUserByName(@RequestParam(value = "name2", required = false, defaultValue = "yew") String name) {
        return userService.getUserByName(name);
    }

    @GetMapping(value = "usernamesex")
    public Object getUserByNameAndSex(@RequestParam(value = "name2", required = false, defaultValue = "yew") String name,
            @RequestParam(value = "sex", required = false, defaultValue = "f") String sex) {
        return userService.getUserByNameAndSex(name,sex);
    }



    @GetMapping(value = "alluser")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @PutMapping(value = "user/{id}/{username}")
    public Object putMethodName(@PathVariable("id") Long id, @PathVariable("username") String userName) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setPassWord("passWord");
        user.setUserSex("userSex");
        user.setNickName("nickName");
        return userService.insertUser(user);
    }


    

}
