package com.neusoft.mid.cip.cloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by ludz on 2018/4/8/008.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApp {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientApp.class, args);
    }
}
