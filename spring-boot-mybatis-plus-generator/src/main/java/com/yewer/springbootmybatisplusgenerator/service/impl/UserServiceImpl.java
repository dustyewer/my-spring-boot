package com.yewer.springbootmybatisplusgenerator.service.impl;

import com.yewer.springbootmybatisplusgenerator.entity.User;
import com.yewer.springbootmybatisplusgenerator.mapper.UserMapper;
import com.yewer.springbootmybatisplusgenerator.service.UserService;
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
