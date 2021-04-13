package com.yewer.webservice;

import org.springframework.aop.framework.Advised;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Endpoint;
import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SpringBootApplication
public class WebserviceApplication implements ApplicationContextAware{
	 private static ApplicationContext applicationContext;
	 private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	public static void main(String[] args) {

		SpringApplication.run(WebserviceApplication.class, args);
		Endpoint.publish("http://localhost:8081/ws",new UserServiceImpl());
		UserServiceImpl  userService=(UserServiceImpl)applicationContext.getBean("userServiceImpl");
		if( !(userService instanceof Advised))
			System.out.println("inomp");
		Iterator<String> it =new ArrayList<String>(Arrays.asList("1","2")).iterator();
		List<String> list = new ArrayList<String>();
		List<String> synchronizedList = Collections.synchronizedList(list);
		File file = new File("d");
		try {
			InputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);


		Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				return null;
			}
		};

		Thread thread = new Thread(new FutureTask<String>(callable));



	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
