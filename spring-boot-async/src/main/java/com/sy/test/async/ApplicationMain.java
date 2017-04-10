package com.sy.test.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 系统启动类
 *
 * @author yang.sun
 * @date 2016/12/6
 */
@EnableAsync //让@Async注解能够生效
@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        //启动Spring Boot项目的唯一入口
        SpringApplication.run(ApplicationMain.class, args);
    }
}
