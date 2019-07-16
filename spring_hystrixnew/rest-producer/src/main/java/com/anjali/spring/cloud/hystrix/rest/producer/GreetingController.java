package com.anjali.spring.cloud.hystrix.rest.producer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anjalisatraboina on 5/23/2017.
 */

public interface GreetingController {
    @RequestMapping("/greeting/{username}")
    String greeting(@PathVariable("username") String username);
}