package com.esprit.devops.service;

import com.esprit.devops.model.Country;
import com.esprit.devops.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements  CountryService{


    private final CountryRepository countryRepository;
    private static final Logger logger  = LogManager.getLogger() ;

    @Override
    public Country save(Country country) {
        logger.info("Start Saving Country");
       Country savedCountry = countryRepository.save(country);
       logger.info("End Sacing Country");
       return savedCountry ;
    }

    @Override
    public Collection<Country> findAll() {
        logger.info("Start Fetching All countries");
        List<Country> allCountries = countryRepository.findAll();
        logger.info("End Fetching All Countries");
        return allCountries ;
    }

    @Override
    public Country findById(String id) {
        logger.info("Start find by Id process");
       return countryRepository.findById(id).orElse(null);
    }

    @Override
    public Country deleteById(String id) {
        Country countryToremove = countryRepository.findById(id).orElse(null);
        if (countryToremove != null) {
            countryRepository.deleteById(id);
            return countryToremove ;
        } else {
            logger.error("Country does not exist in the database");
            throw new RuntimeException("Hello");
        }
    }

    @Override
    public void deleteAll() {
        logger.info("Start Deleting all countries");
        countryRepository.deleteAll();
        logger.info("end deleting all countries");
    }
}
