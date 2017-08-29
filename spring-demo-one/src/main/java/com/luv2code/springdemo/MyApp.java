package com.luv2code.springdemo;

/**
 * Created by sarnold on 6/26/2017.
 */
public class MyApp {
    public static void main(String[] args){
        // create the object
        Coach theCoach = new TrackCoach();

        //used the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
