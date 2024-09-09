package com.jgmedellin.springcoredemo.common;

import org.springframework.stereotype.Component;

// (a spring bean is a class that is managed by the Spring IoC container)
@Component // This annotation marks the class as a Spring bean and makes it available for dependency injection
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
