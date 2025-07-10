package com.foliage.startspringboot3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.foliage.startspringboot3.mapper")
public class StartSpringboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(StartSpringboot3Application.class, args);
    }

}
