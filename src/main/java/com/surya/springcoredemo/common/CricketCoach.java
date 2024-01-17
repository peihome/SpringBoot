package com.surya.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 20 minutes!!!";
    }
}
