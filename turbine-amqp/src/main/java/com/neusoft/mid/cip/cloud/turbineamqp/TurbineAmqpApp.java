package com.neusoft.mid.cip.cloud.turbineamqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by ludz on 2018/4/6/006.
 */
@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineAmqpApp {
    public static void main(String[] args){
        SpringApplication.run(TurbineAmqpApp.class, args);
    }
}
