package com.jgmedellin.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component annotation marks the class as a Spring bean and makes it available for dependency injection.
// A spring bean is a class that is managed by the Spring IoC container.
// @Primary annotation is used to give a higher preference to a bean when there are multiple beans of the same type.
// @Lazy // This annotation tells spring to create a bean only when it is needed.
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // This annotation tells spring to create a new instance of the bean every time it is requested.
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct // This annotation tells spring to call this method after the bean has been created.
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff method: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy // This annotation tells spring to call this method before the bean is destroyed.
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff method: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
