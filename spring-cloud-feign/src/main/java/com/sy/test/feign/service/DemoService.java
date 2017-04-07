package com.sy.test.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yang.sun
 * @date 2017/4/7
 */

//用于通知Feign组件对该接口进行代理(不需要编写接口实现)，使用者可直接通过@Autowired注入
//意为通知Feign在调用该接口方法时要向Eureka中查询名为test的服务，从而得到服务URL。
@FeignClient("test")
public interface DemoService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getWord();


    /**
     * RequestMapping中的method将请求方式指定为POST，那么所有未标注解的参数将会被忽略
     */
    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.POST)
    void update(@PathVariable("groupId") Integer groupId, @RequestParam("groupName") String groupName);

}
