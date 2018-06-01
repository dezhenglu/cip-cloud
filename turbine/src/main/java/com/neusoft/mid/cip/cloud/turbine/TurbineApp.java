package com.neusoft.mid.cip.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by ludz on 2018/4/6/006.
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineApp {
    public static void main(String[] args){
        SpringApplication.run(TurbineApp.class, args);
    }
}
