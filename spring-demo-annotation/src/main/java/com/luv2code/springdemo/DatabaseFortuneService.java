package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by sarnold on 6/27/2017.
 */
@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
