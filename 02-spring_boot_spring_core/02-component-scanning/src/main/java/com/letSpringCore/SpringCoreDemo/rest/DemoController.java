package com.letSpringCore.SpringCoreDemo.rest;


import util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    creating construtor in our class for injections

//    define a private field for the dependency

    private Coach myCoach;

    // define constructor for dependency injection

    @Autowired
    public  DemoController(Coach theCoach){

        myCoach=theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }




}
