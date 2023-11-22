package com.example.curddemo.dao;

import com.example.curddemo.entity.student;

public interface StudentDAO {

     void save(student theStudent);

     student findById(Integer id);
}
