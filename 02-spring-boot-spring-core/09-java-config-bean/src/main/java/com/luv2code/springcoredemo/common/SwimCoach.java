package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    public String getDailyWorkout() {
        return "Swim 1000m for a warm up!!!";
    }
}
