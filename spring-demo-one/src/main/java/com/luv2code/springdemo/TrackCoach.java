package com.luv2code.springdemo;

/**
 * Created by sarnold on 6/26/2017.
 */
public class TrackCoach implements Coach {
    //define a private field for the dependency
    private FortuneService fortuneService;

    public TrackCoach() {

    }

    //define a constructor for dependency injection
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    @Override
    public String getDailyRandomFortune() {
        return "Daily Random Fortune is: " + fortuneService.getFortune();
    }

    // add a init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside my method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo(){
        System.out.println("TrackCoach: inside my method doMyCleanupStuffYoYo");
    }
}
