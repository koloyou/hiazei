package com.jri.day71;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jri.day71.dao")
public class Day71Application {

    public static void main(String[] args) {
        SpringApplication.run(Day71Application.class, args);
    }


}
