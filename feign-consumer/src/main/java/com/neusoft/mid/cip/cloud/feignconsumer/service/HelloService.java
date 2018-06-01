package com.neusoft.mid.cip.cloud.feignconsumer.service;

import com.neusoft.mid.cip.cloud.entity.User;
import com.neusoft.mid.cip.cloud.feignconsumer.component.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ludz on 2018/4/7/007.
 */
@FeignClient(value = "HELLO-SERVICE", fallback = HelloServiceFallback.class)
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
