package com.jgmedellin.springcoredemo.config;

import com.jgmedellin.springcoredemo.common.Coach;
import com.jgmedellin.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation tells spring that this class is a configuration class to define beans.
public class SportConfig {

    @Bean("aquatic") // This annotation tells spring that this method will return a bean. The custom bean id is "aquatic".
    public Coach swimCoach() { // The method name is the bean id.
        return new SwimCoach();
    }
}
