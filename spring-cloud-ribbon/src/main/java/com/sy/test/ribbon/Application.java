package com.sy.test.ribbon;

import com.sy.test.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @RibbonClient(name = "test") : test是服务提供者的服务名称
 * @author yang.sun
 * @date 2017/4/7
 */
@SpringBootApplication
@EnableEurekaClient
//启动时，加载RibbonConfiguration类
@RibbonClient(name = "test", configuration = RibbonConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
