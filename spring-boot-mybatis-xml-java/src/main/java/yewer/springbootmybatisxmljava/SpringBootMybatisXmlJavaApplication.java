package yewer.springbootmybatisxmljava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yewer.springbootmybatisxmljava.mapper")
public class SpringBootMybatisXmlJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisXmlJavaApplication.class, args);
	}

}
