package com.sy.test.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yang.sun
 * @date 2017/4/12
 */
@Service
public class DemoService {

    @Transactional(value="transactionManager1")
    public void save() {
        //doSave
    }
}
