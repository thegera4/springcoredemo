package com.jgmedellin.springcoredemo.rest;

import com.jgmedellin.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection (Constructor injection)
    @Autowired // This annotation tells spring to inject a dependency (optional if you only have 1 constructor)
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    //define a setter method for dependency injection (Setter injection)
    //@Autowired
    //public void setCoach(Coach theCoach) {
        //yCoach = theCoach;
    //

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
