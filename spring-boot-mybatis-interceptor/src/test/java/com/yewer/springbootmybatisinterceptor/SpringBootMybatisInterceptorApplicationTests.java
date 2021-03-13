package com.yewer.springbootmybatisinterceptor;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisInterceptorApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootMybatisInterceptorApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("this={}", this);
	}

}
