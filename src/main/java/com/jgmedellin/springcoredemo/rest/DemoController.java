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
    private Coach anotherCoach;

    //define a constructor for dependency injection (Constructor injection)
    @Autowired // This annotation tells spring to inject a dependency (optional if you only have 1 constructor)
    public DemoController(
            @Qualifier("aquatic") Coach theCoach, //default injection is singleton
            @Qualifier("aquatic") Coach theAnotherCoach //here we can use "aquatic as it is the custom bean id"
    ) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
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

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach and anotherCoach: " + (myCoach == anotherCoach);
    }
}
