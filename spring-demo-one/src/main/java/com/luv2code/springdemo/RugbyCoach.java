package com.luv2code.springdemo;

/**
 * Created by sarnold on 6/26/2017.
 */
public class RugbyCoach implements Coach {
    //define a private field for the dependency
    private FortuneService fortuneService;

    public RugbyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Scrum";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyRandomFortune() {
        return "Rugby Random Fortune is: " + fortuneService.getFortune();
    }
}
