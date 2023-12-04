package com.example.demo.rest;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class StudentRestController {

     // define endpoint for "/student" --> return a list of student

     private  List<Student> theStudents;

     // define @postConstruct to load the student data.. since it is only called once
     // at th time of Beans creation
     @PostConstruct   // use only once when the Beans is created
     public void loadData(){
          theStudents=new ArrayList<>();

          theStudents.add(new Student("sourav","shaw"));
          theStudents.add(new Student("sourav","kohli"));
          theStudents.add(new Student("Gautam","Gambhir"));
     }


     @GetMapping("/students")
     public  List<Student> getStudents(){
          return  theStudents;
     }

     // define endpoint or "/students/{studentid}" -return student at index

     @GetMapping("/students/{studentId}")
     public Student getStudent(@PathVariable int studentId){
          // just index into the list
          if(studentId >= theStudents.size() || studentId<0){
               throw  new StudentNotFoundException("student id not found-"+studentId);
          }
          return theStudents.get(studentId);
     }
}
