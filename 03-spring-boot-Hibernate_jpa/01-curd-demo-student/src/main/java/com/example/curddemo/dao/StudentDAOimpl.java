package com.example.curddemo.dao;

import com.example.curddemo.entity.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

     @Override
     public student findById(Integer id) {
          return entityManager.find(student.class,id);
     }

     @Override
     public List<student> findAll() {
          TypedQuery<student> thequery=entityManager.createQuery("FROM student order by lastName",student.class);
          return thequery.getResultList();
     }

     @Override
     public List<student> findByLastName(String theLastName) {
          // create query
          TypedQuery<student> theQuery=entityManager.createQuery("FROM student WHERE lastName=:theData",student.class);

          // set query parameters
          theQuery.setParameter("theData",theLastName);

          // return query result
          return  theQuery.getResultList();
     }

     @Override
     @Transactional
     public void update(student theStudent) {
          entityManager.merge(theStudent);

     }

     @Override
     @Transactional
     public void delete(Integer id) {
          student mystudent=entityManager.find(student.class,id);
          entityManager.remove(mystudent);
     }

     @Override
     @Transactional
     public int deleteAll() {
          int numRowsDeleted=entityManager.createQuery("DELETE FROM student").executeUpdate();

          return numRowsDeleted;
     }
}
