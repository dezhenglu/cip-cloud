package com.neusoft.mid.cip.cloud.hello.controller;

import com.neusoft.mid.cip.cloud.entity.User;
import com.neusoft.mid.cip.cloud.helloserviceapi.service.HelloService;

/**
 * Created by ludz on 2018/4/7/007.
 */
public class RefactorHelloService implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
