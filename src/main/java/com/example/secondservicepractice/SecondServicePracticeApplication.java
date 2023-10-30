package com.example.secondservicepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecondServicePracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondServicePracticeApplication.class, args);
    }

}
