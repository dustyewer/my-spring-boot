package com.yewer.springbootmybatisinterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yewer.springbootmybatisinterceptor.dao")
public class SpringBootMybatisInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisInterceptorApplication.class, args);
	}

}
