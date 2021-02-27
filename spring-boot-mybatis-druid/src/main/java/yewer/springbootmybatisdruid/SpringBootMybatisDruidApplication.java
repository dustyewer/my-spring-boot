package yewer.springbootmybatisdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yewer.springbootmybatisdruid.mapper")
public class SpringBootMybatisDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisDruidApplication.class, args);
	}

}
