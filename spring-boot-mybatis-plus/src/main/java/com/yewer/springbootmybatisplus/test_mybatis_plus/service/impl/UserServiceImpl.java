package com.yewer.springbootmybatisplus.test_mybatis_plus.service.impl;

import com.yewer.springbootmybatisplus.test_mybatis_plus.entity.User;
import com.yewer.springbootmybatisplus.test_mybatis_plus.mapper.UserMapper;
import com.yewer.springbootmybatisplus.test_mybatis_plus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yewer
 * @since 2021-02-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
