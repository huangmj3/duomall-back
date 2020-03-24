package com.huangmaojie.duomall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huangmaojie
 * @date 2020.2.26
 */
//@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.huangmaojie.duomall.user.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("---------------------END---------------------");
    }

}
