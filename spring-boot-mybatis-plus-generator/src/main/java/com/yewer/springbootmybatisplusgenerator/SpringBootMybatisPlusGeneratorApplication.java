package com.yewer.springbootmybatisplusgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yewer.springbootmybatisplusgenerator.mapper")
public class SpringBootMybatisPlusGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisPlusGeneratorApplication.class, args);
	}

}
