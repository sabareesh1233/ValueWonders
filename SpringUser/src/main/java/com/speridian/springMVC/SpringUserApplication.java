package com.speridian.springMVC;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SpringBootApplication
@PropertySource({ "classpath:application.properties" })
@MapperScan("com.speridian.springMVC.mapper")
public class SpringUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserApplication.class, args);
	}
}
       