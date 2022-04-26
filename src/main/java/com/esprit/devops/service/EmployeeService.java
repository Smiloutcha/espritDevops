package com.esprit.devops.service;

import com.esprit.devops.model.Employee;

import java.util.Collection;

public interface EmployeeService {

     Employee save(Employee employee);
     Collection<Employee> findAll();
     Employee findById(Long id) ;
     Employee deleteById(Long id);
     void deleteAll() ;


}
