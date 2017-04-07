package com.sy.test.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yang.sun
 * @date 2017/4/6
 */
@EnableEurekaServer         //该注解表明应用为eureka服务，有可以联合多个服务作为集群，对外提供服务注册以及发现功能
@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
public class EurekaServiceApplication {
    //spring boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
