package com.example.curddemo.dao;

import com.example.curddemo.entity.student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository    // it is used for DAO(data access object)
public class StudentDAOimpl implements StudentDAO{

     // define field for entity manager
     private EntityManager entityManager;

     // inject entity manager using constructor injection
     @Autowired
     public StudentDAOimpl(EntityManager entityManager) {
          this.entityManager = entityManager;
     }

     // implement save method

     @Override
     @Transactional  // since we are performing an update
     public void save(student theStudent) {
          entityManager.persist(theStudent);
     }
}
