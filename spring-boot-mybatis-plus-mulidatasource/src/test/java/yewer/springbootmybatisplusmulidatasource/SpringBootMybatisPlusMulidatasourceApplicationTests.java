package yewer.springbootmybatisplusmulidatasource;

import com.baomidou.dynamic.datasource.annotation.DS;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yewer.springbootmybatisplusmulidatasource.service.UserService;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootMybatisPlusMulidatasourceApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	@DS("dm")
	void test01() {
		System.out.println(userService.getById(1));

	}

	@Test
	@DS("ds")
	//在单元测试中DS不生效，不知道为什么
	void test02() {
		System.out.println(userService.getById(1));

	}

}
