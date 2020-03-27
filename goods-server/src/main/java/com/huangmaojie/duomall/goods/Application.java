package com.huangmaojie.duomall.goods;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangmaojie
 * @date 2020.2.26
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.huangmaojie.duomall.goods.mapper")
public class    Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("---------------------END---------------------");
    }

}
