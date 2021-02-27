package yewer.springbootmybatisdruid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMybatisDruidApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement("select * from user ");
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			String userName = resultSet.getString("user_name");
			System.out.println(userName);
		}

	}

}
