package com.esprit.devops.controller;

import com.esprit.devops.model.Country;
import com.esprit.devops.model.Employee;
import com.esprit.devops.service.CountryService;
import com.esprit.devops.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController("/countries")
@AllArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @PostMapping("/save")
    public ResponseEntity<Country> save (@RequestBody Country country) {
        return new ResponseEntity<>(countryService.save(country), HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Country> findById(@PathVariable("id") String id) {
        return new ResponseEntity<>(countryService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    private ResponseEntity<Collection<Country>> findAll() {
        return new ResponseEntity<>(countryService.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Country> deleteById (@PathVariable("id")  String id) {
        return new ResponseEntity<>(countryService.deleteById(id),HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll")
    private void deleteAll () {
        countryService.deleteAll();
    }


}