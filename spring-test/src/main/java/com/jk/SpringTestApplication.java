package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class SpringTestApplication extends SpringBootServletInitializer{


	public static void main(String[] args){
		SpringApplication.run(SpringTestApplication.class, args);
	}
}
