package com.sy.test.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author yang.sun
 * @date 2017/4/6
 */
@SpringBootApplication //@Configuration + @EnableAutoConfiguration + @ComponentScan
@EnableHystrix //Spring boot工程启用hystrix
@EnableHystrixDashboard //启动对hystrix的监控
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
