package com.neusoft.mid.cip.cloud.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by ludz on 2018/4/6/006.
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApp.class, args);
    }
}
