package com.esprit.devops.service;


import com.esprit.devops.model.Department;

import java.util.Collection;

public interface DepartmentService {

    Department save(Department country);
    Collection<Department> findAll();
    Department findById(String id) ;
    Department deleteById(String id);
    void deleteAll() ;


}
