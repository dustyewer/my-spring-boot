package com.yewer.springbootmybatisinterceptor.dao;

import java.util.List;

import com.yewer.springbootmybatisinterceptor.common.Page;

//import org.apache.ibatis.annotations.Mapper;

import com.yewer.springbootmybatisinterceptor.model.User;

import org.apache.ibatis.annotations.Param;

//@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    List<User> selectPage(@Param("page") Page page);
}