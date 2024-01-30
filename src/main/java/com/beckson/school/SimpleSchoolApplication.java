package com.beckson.school;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.beckson.school.dao")
public class SimpleSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSchoolApplication.class, args);
    }

}
