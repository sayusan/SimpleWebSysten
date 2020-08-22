package com.qdenbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.qdenbs.db.table.mapper")
@SpringBootApplication
@MapperScan("com.qdenbs.db.table.mapper")
public class Nw1gWebPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(Nw1gWebPlatformApplication.class, args);
    }

}
