package com.springboot.MyTodoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
public class MyTodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTodoListApplication.class, args);
	}
}
