package com.luv2code.springdemo;

/**
 * Created by sarnold on 6/26/2017.
 */
public class HappyFortuneService implements FortuneService {
    String[] fortunes = new String[]{"Today is your lucky day!",
            "Good luck will be coming your way!",
            "Good things will come!"};

    @Override
    public String getFortune(){
        return "Today is your lucky day!";
    }

    @Override
    public String getRandomFortune(){
        int randomNum = 0 + (int)(Math.random() * 2);
        return fortunes[randomNum];
    }
}
