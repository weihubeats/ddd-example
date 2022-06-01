package com.ddd.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

/**
 * @author : wh
 * @date : 2022/6/1 14:30
 * @description:
 */
@SpringBootApplication
public class DDDApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(DDDApplication.class, args);
    }
}
