package com.yewer.springbootmybatismulidatasource;

import com.yewer.springbootmybatismulidatasource.mapper.ds1.User1Mapper;
import com.yewer.springbootmybatismulidatasource.mapper.ds2.User2Mapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootMybatisMulidatasourceApplicationTests {

	@Autowired
	User1Mapper user1Mapper;

	@Autowired
	User2Mapper user2Mapper;

	@Test
	void test01() {

	}

}
