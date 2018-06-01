package com.neusoft.mid.cip.cloud.ribbonconsumer.controller;

import com.neusoft.mid.cip.cloud.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ludz on 2017/10/30/030.
 */
@RestController
public class ConsumerController {

//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String index(){
//        return restTemplate.getForEntity(
//                "http://hello-service/hello", String.class).getBody();
        return helloService.helloService();
    }
}
