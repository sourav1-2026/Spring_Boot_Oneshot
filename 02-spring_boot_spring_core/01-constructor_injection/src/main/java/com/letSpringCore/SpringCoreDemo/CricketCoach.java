package com.letSpringCore.SpringCoreDemo;

import org.springframework.stereotype.Component;

// Component annotation marks the class as a spring Beans,makes it avilable for dependency injection

@Component
public class CricketCoach implements  Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 35 minute!!!!!";
    }
}
