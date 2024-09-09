package com.jgmedellin.springcoredemo.common;

// this class does not use the @component annotation so that we can use Java configuration to define it as a bean.
public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }
}
