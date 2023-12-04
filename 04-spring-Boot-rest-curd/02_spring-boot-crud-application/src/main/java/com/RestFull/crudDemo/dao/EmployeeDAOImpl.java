package com.RestFull.crudDemo.dao;

import com.RestFull.crudDemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

     // define field for entityManger
     private EntityManager entityManager;

     // ser up constructor injection
     @Autowired
     public  EmployeeDAOImpl(EntityManager theEntityManger){
          entityManager=theEntityManger;
     }
     @Override
     public List<Employee> findAll() {

          // create a query
          TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee",Employee.class);

          // execute the query and get result list
          List<Employee> employees=theQuery.getResultList();

          // return the result
          return  employees;

     }

     @Override
     public Employee findById(int theId) {

          Employee theEmployee=entityManager.find(Employee.class,theId);
          return theEmployee;
     }

     @Override
     public Employee save(Employee theEmployee) {

          Employee dbEmployee=entityManager.merge(theEmployee);
          return dbEmployee;
     }

     @Override
     public void deleteById(int theId) {

          Employee theEmployee=entityManager.find(Employee.class,theId);
          entityManager.remove(theEmployee);
     }
}
