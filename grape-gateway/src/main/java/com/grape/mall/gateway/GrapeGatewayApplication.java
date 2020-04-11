package com.grape.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrapeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrapeGatewayApplication.class, args);
    }
}
