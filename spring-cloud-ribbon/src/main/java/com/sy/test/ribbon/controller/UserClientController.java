package com.sy.test.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yang.sun
 * @date 2017/4/7
 */
@RestController
public class UserClientController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @RequestMapping("/sentence")
    public  String getSentence() {
        return getWord("test");//大小写不区分
    }

    /**
     * 根据服务名，从服务注册中心获取服务，多个相同服务默认轮询方式
     * @param service 服务名称
     * @return
     */
    public String getWord(String service) {
        ServiceInstance instance = loadBalancer.choose(service);
        return (new RestTemplate()).getForObject(instance.getUri(),String.class);
    }
}
