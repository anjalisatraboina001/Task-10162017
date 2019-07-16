package com.anjali.spring.cloud.hystrix.rest.producer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anjalisatraboina on 5/23/2017.
 */

@RestController
public class GreetingControllerImpl implements GreetingController {
    @Override
    public String greeting(@PathVariable("username") String username) {
        return String.format("Hello %s!\n", username);
    }
}
