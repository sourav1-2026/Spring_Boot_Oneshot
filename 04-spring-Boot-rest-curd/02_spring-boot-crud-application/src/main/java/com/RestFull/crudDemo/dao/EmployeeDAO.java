package com.RestFull.crudDemo.dao;

import com.RestFull.crudDemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
     List<Employee> findAll();

     Employee findById(int theId);

     Employee save(Employee theEmployee);

     void deleteById(int theId);
}
