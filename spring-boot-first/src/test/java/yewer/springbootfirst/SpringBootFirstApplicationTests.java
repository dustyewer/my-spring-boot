package yewer.springbootfirst;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yewer.springbootfirst.model.Student;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootFirstApplication.class)

class SpringBootFirstApplicationTests {

	@Autowired
	Student student;

	@Value("${person.id}")
	String personId = "1";

	@Test
	public void studentTest() {

		System.out.println("student=" + student);
	}

	@Test
	void contextLoads() {

		System.out.println("person.id=" + personId);
	}

}
