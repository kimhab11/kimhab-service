package com.hrd.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FraudService {
    public static void main(String[] args) {
        SpringApplication.run(FraudService.class, args);
    }
}
