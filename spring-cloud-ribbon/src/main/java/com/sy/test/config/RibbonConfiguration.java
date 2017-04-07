package com.sy.test.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置ribbon负载策略 配置类不能放在@ComponentScan所扫描的当前包下以及子包下，否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享
 *
 * @author yang.sun
 * @date 2017/4/7
 */
@Configuration
public class RibbonConfiguration {

    /**
     * RandomRule：随机策略
     * RoundRobinRule：轮询策略
     * BestAvailableRule：最少并发数策略
     * WeightedResponseTimeRule：根据响应时间分配一个weight(权重)，响应时间越长，weight越小，被选中的可能性越低
     * ZoneAvoidanceRule：复合判断server所在区域的性能和server的可用性选择server AvailabilityFilteringRule：过滤掉那些因为一直连接失败的被标记为circuit
     * tripped的后端server，并过滤掉那些高并发的的后端server
     */

    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}
