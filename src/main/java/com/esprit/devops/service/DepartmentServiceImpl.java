package com.esprit.devops.service;

import com.esprit.devops.model.Department;
import com.esprit.devops.repository.DepartmentRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRespository departmentRespository;

    @Override
    public Department save(Department country) {
        return departmentRespository.save(country);
    }

    @Override
    public Collection<Department> findAll() {
       return departmentRespository.findAll();
    }

    @Override
    public Department findById(String id) {
       return departmentRespository.findById(id).orElse(null);
    }

    @Override
    public Department deleteById(String id) {
       Department departmentToRemove = departmentRespository.findById(id).orElse(null);
       if (departmentToRemove != null) {
           departmentRespository.deleteById(id);
           return departmentToRemove ;
       } else {
           throw new RuntimeException("No message");
       }
    }

    @Override
    public void deleteAll() {

    }
}
