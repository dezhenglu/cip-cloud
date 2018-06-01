package com.neusoft.mid.cip.cloud.feignconsumer.service;


import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by ludz on 2018/4/7/007.
 */
@FeignClient("HELLO-SERVICE")
public interface RefactorHelloService extends com.neusoft.mid.cip.cloud.helloserviceapi.service.HelloService{
}
