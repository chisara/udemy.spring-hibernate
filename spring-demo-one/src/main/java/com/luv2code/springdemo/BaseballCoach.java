package com.luv2code.springdemo;

/**
 * Created by sarnold on 6/26/2017.
 */
public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyRandomFortune() {
        return "Baseball Random Fortune is: " + fortuneService.getFortune();
    }
}
