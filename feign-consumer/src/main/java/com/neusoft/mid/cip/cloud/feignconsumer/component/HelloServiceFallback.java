package com.neusoft.mid.cip.cloud.feignconsumer.component;

import com.neusoft.mid.cip.cloud.entity.User;
import com.neusoft.mid.cip.cloud.feignconsumer.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by ludz on 2018/4/7/007.
 */
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
