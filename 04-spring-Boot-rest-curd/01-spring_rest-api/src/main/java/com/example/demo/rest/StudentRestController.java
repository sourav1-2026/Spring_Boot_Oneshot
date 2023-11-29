package com.example.demo.rest;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StudentRestController {

     // define endpoint for "/student" --> return a list of student

     @GetMapping("/students")
     public  List<Student> getStudents(){
          List<Student> theStudents=new ArrayList<>();  // for each request we are creating this

          theStudents.add(new Student("sourav","shaw"));
          theStudents.add(new Student("sourav","kohli"));
          theStudents.add(new Student("Gautam","Gambhir"));
          return  theStudents;
     }
}
