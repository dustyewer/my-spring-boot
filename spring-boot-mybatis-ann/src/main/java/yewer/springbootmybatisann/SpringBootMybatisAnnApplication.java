package yewer.springbootmybatisann;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yewer.springbootmybatisann.mapper")
public class SpringBootMybatisAnnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisAnnApplication.class, args);
	}

}
