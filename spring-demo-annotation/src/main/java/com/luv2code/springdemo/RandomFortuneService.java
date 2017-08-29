package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by sarnold on 6/27/2017.
 */
@Component
public class RandomFortuneService implements FortuneService {
    String[] fortunes = new String[]{"Today is your lucky day!",
            "Happiness will come your way",
            "Much luck will come to you"};

    @Override
    public String getFortune() {
        int randomNum = 0 + (int)(Math.random() * 2);
        return fortunes[randomNum];
    }
}
