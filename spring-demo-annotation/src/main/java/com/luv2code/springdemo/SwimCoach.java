package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand stroke";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
