package yewer.springbootmybatisxmlresource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yewer.springbootmybatisxmlresource.dao")
public class SpringBootMybatisXmlResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisXmlResourceApplication.class, args);
	}

}
