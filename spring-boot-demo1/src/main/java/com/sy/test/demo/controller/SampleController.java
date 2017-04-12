package com.sy.test.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @content @RestController = { @Controller @ResponseBody }
 * @author yang.sun
 * @date 20160403
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping(value = "/hello/{username}",method = RequestMethod.GET)
    String home(@PathVariable("username")String username) {
        return String.format("Hello user %s", username);
    }


}
