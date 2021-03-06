package yewer.springbootservletreg.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import yewer.springbootservletreg.HelloServlet;
import yewer.springbootservletreg.HelloServlet2;

@Configuration
public class ServletReg {
    @Bean
    public ServletRegistrationBean setHello() {
        return new ServletRegistrationBean(new HelloServlet(), "/hello");
    }

    @Bean
    public ServletRegistrationBean setHello2() {
        return new ServletRegistrationBean(new HelloServlet2(), "/hello2");
    }

}
