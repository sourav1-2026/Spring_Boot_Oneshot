package com.example.demo.entity;

public class Student {
     private  String firstName;

     private String lastName;


//     No argument Constructor
     public Student(){

     }
//     argument Construtor
     public Student(String firstName, String lastName){
          this.firstName=firstName;
          this.lastName=lastName;
     }

     // let's have setter and getter for Data Binding with the help of Jakson

     public String getFirstName() {
          return firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }
}
