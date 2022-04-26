package com.esprit.devops.service;

import com.esprit.devops.model.Country;
import com.esprit.devops.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements  CountryService{

    private final CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
       return countryRepository.save(country);
    }

    @Override
    public Collection<Country> findAll() {
       return countryRepository.findAll();
    }

    @Override
    public Country findById(String id) {
       return countryRepository.findById(id).orElse(null);
    }

    @Override
    public Country deleteById(String id) {
        Country countryToremove = countryRepository.findById(id).orElse(null);
        if (countryToremove != null) {
            countryRepository.deleteById(id);
            return countryToremove ;
        } else {
            throw new RuntimeException("Hello");
        }
    }

    @Override
    public void deleteAll() {
        countryRepository.deleteAll();
    }
}
