package com.sy.test.zuul;

import com.sy.test.zuul.filter.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author yang.sun
 * @date 2017/4/7
 */
@SpringBootApplication
@EnableZuulProxy
public class Application {

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
