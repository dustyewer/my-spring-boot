package yewer.springbootmybatisplusmulidatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yewer.springbootmybatisplusmulidatasource.mapper")
public class SpringBootMybatisPlusMulidatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisPlusMulidatasourceApplication.class, args);
	}

}
