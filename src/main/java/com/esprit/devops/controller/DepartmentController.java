package com.esprit.devops.controller;

import com.esprit.devops.model.Department;
import com.esprit.devops.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<Department> save (@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.save(department), HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Department> findById(@PathVariable("id") String id) {
        return new ResponseEntity<>(departmentService.findById(id), HttpStatus.OK);
    }


    @GetMapping("/findAll")
    private ResponseEntity<Collection<Department>> findAll() {
        return new ResponseEntity<>(departmentService.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Department> deleteById (String id) {
        return new ResponseEntity<>(departmentService.deleteById(id),HttpStatus.OK);
    }


    @DeleteMapping("/deleteAll")
    private void deleteAll () {
        departmentService.deleteAll();
    }
}
