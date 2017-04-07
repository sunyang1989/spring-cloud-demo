package com.sy.test.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yang.sun
 * @date 2017/4/6
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    //http://localhost:8888/foo/dev

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
