package com.yewer.vueandjpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class CrosConfig implements WebMvcConfigurer{

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET","POST")
        .allowCredentials(false)
        .maxAge(3600)
        .allowedHeaders("*");
    }


}