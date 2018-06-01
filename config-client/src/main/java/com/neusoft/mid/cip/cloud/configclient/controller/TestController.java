package com.neusoft.mid.cip.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ludz on 2018/4/8/008.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${url}")
    String url;

    @RequestMapping("/url")
    public String url(){
        return this.url;
    }
}
