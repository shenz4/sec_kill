package com.shen.sec_kill.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:context/db-context.xml"})
@MapperScan(basePackages = "com.shen.sec_kill.dao.mapper")
public class SecondKillApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondKillApplication.class);
    }
}
