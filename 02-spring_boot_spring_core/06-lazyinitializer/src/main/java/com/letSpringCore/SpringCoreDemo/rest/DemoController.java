package com.letSpringCore.SpringCoreDemo.rest;


import com.letSpringCore.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    creating construtor in our class for injections

//    define a private field for the dependency

    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("baseballCoach")  Coach theCoaach){

        myCoach=theCoaach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }




}
