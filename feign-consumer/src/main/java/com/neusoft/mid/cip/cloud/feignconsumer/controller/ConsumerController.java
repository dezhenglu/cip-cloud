package com.neusoft.mid.cip.cloud.feignconsumer.controller;

import com.neusoft.mid.cip.cloud.entity.User;
import com.neusoft.mid.cip.cloud.feignconsumer.service.HelloService;
import com.neusoft.mid.cip.cloud.feignconsumer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ludz on 2018/4/7/007.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello() + "\n");
        sb.append(helloService.hello("ludzh") + "\n");
        sb.append(helloService.hello("ludzh", 29) + "\n");
        sb.append(helloService.hello(new User("ludzh", 29)) + "\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello() + "\n");
        sb.append(helloService.hello("haha") + "\n");
        sb.append(helloService.hello("haha", 29) + "\n");
        sb.append(helloService.hello(new User("haha", 29)) + "\n");
        return sb.toString();
    }
}
