package com.esprit.devops.controller;


import com.esprit.devops.model.Employee;
import com.esprit.devops.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController("/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save (@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Employee> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    private ResponseEntity<Collection<Employee>> findAll() {
        return new ResponseEntity<>(employeeService.findAll(),HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Employee> deleteById (Long id) {
        return new ResponseEntity<>(employeeService.deleteById(id),HttpStatus.OK);
    }


    @DeleteMapping("/deleteAll")
    private void deleteAll () {
        employeeService.deleteAll();
    }


}
