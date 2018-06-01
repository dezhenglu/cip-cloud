package com.neusoft.mid.cip.cloud.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by ludz on 2018/3/30/030.
 */
@EnableDiscoveryClient
@EnableWebSecurity
@SpringBootApplication
public class HelloServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApp.class, args);
    }
}