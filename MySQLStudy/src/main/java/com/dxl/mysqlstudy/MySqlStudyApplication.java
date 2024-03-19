package com.dxl.mysqlstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dxl.mysqlstudy.mappers")
@SpringBootApplication
public class MySqlStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySqlStudyApplication.class, args);
    }

}
