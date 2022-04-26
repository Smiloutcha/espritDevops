package com.esprit.devops.service;

import com.esprit.devops.model.Country;

import java.util.Collection;

public interface CountryService {

    Country save(Country country);
    Collection<Country> findAll();
    Country findById(String id) ;
    Country deleteById(String id);
    void deleteAll() ;
}
