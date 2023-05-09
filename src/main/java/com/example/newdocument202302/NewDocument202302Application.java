package com.example.newdocument202302;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com/item/mapper")
@EnableCircuitBreaker
@EnableFeignClients
public class NewDocument202302Application {

    public static void main(String[] args) {
        SpringApplication.run(NewDocument202302Application.class, args);
    }

}
