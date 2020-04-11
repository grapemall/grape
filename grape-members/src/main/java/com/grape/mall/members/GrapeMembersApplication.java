package com.grape.mall.members;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrapeMembersApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrapeMembersApplication.class, args);
    }

}
