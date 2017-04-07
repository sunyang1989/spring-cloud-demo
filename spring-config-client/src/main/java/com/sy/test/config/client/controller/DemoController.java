package com.sy.test.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang.sun
 * @date 2017/4/6
 */
@RestController
@RefreshScope
public class DemoController {

    @Value("${name}") //从配置文件加载
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!";
    }
}
