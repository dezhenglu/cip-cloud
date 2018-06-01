package com.neusoft.mid.cip.cloud.hello.controller;

import com.neusoft.mid.cip.cloud.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ludz on 2018/3/30/030.
 */
@RestController
public class HelloController {
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        client.getServices().forEach(id -> {
            client.getInstances(id).forEach(instance -> {
                logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
            });
        });
        return "hello world";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age){
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello " + user.getName() + ", " + user.getAge();
    }

}
