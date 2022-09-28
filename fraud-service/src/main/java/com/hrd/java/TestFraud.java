package com.hrd.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestFraud {
    public static void main(String[] args) {
        SpringApplication.run(TestFraud.class, args);
    }
}
