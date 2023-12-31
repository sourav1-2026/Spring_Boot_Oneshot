package com.learnSpring.demo.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//when you are writting a rest controller then you have to write the annotation
@RestController
public class FunRestController {
//    expose "/" that return Hello world


    @GetMapping("/")
    public  String sayHello(){

        return  "hello world";
    }

//    expose a new end-point

    @GetMapping("/workout")
    public  String getDailyWorkOut(){
        return "working";
    }

    @GetMapping("/gym")
    public  String getDailygym(){
        return "gyming";
    }
}
