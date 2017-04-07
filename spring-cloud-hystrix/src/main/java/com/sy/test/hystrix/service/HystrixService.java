package com.sy.test.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yang.sun
 * @date 2017/4/6
 */
@Service
public class HystrixService {

    @Autowired
    private CallDependencyService dependencyService;
    public String callDependencyService() {
        return dependencyService.mockGetUserInfo();
    }
}
