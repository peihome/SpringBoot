package com.surya.springcoredemo.rest;

import com.surya.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    private Coach anotherCoach;

    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){

        System.out.println(getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkCoach(){
        return "Is coach same? " + (myCoach == anotherCoach);
    }
}





















