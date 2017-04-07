package com.sy.test.feign.controller;

import com.sy.test.feign.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang.sun
 * @date 2017/4/7
 */
@RestController
public class DemoController {

    @Autowired
    @LoadBalanced
    private DemoService service;

    @RequestMapping("/sentence")
    @ResponseBody
    public String getSentence() {
        return getWord();//大小写不区分
    }

    public String getWord() {
        String sentence = "There was a problem assembling the sentence!";
        try {
            sentence = service.getWord();
        } catch (Exception e) {
            System.out.println(e);
        }
        return sentence;
    }
}
