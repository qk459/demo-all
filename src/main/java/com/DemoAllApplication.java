package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.dao")
public class DemoAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAllApplication.class, args);
    }

}
