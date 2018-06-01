package com.neusoft.mid.cip.cloud.feignconsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Created by ludz on 2018/4/7/007.
 */
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApp {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApp.class, args);
    }
}
