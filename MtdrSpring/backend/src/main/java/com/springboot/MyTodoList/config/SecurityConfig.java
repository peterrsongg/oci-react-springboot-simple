package com.springboot.MyTodoList.config;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.List;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure (HttpSecurity http) throws Exception{
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOrigins(List.of("http://localhost:3000","https://objectstorage.us-phoenix-1.oraclecloud.com","https://petstore.swagger.io"));
        corsConfiguration.setAllowedMethods(List.of("POST","PUT","DELETE"));
        corsConfiguration.setExposedHeaders(List.of("location"));
    }

}
