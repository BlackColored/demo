package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author AIOps
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserService1Application {
    public static void main(String[] args) {
        SpringApplication.run(UserService1Application.class, args);
    }
}
