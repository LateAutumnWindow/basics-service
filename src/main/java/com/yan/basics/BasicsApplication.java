package com.yan.basics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yan.basics.dao")
public class BasicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args);
    }
}
