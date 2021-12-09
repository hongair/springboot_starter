package com.springboot_1209;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@MapperScan("com.springboot_1209.mapper") //扫描的mapper
@EnableWebMvc //swagger
@SpringBootApplication
public class Springboot1209Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1209Application.class, args);
    }

}
