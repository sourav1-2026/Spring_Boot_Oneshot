package com.example.curddemo.dao;

import com.example.curddemo.entity.student;

import java.util.List;

public interface StudentDAO {

     void save(student theStudent);

     student findById(Integer id);

     List<student> findAll();

     List<student> findByLastName(String theLastName);

     void update(student theStudent);

     void delete(Integer id);

     int deleteAll();
}
