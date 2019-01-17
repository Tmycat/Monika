package com.cat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:MainApplication
 * discription:
 * author:王震涛
 * createTime:2019-01-16 19:44
 */
@SpringBootApplication
@MapperScan("com.cat.dao")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

}
