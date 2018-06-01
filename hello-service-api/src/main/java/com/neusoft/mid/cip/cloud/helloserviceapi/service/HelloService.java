package com.neusoft.mid.cip.cloud.helloserviceapi.service;

import com.neusoft.mid.cip.cloud.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ludz on 2018/4/7/007.
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    public String hello(@RequestBody User user);

}
