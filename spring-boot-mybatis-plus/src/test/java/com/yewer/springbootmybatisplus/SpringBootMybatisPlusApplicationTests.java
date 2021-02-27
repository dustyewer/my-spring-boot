package com.yewer.springbootmybatisplus;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yewer.springbootmybatisplus.mapper.UserMapper;
import com.yewer.springbootmybatisplus.model.User;
import com.yewer.springbootmybatisplus.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootMybatisPlusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	void test01() {
		List<User> userList = userMapper.selectList(null);
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	void test02() {
		List<User> userList = userService.list();
		for (User user : userList) {
			System.out.println(user);
		}
	}


	@Test
	void test04() {
		Page<User> page = new Page<>(1, 2);
		IPage<User> userPage = userService.page(page, null);
		System.out.println(userPage.getTotal());
	}

}
