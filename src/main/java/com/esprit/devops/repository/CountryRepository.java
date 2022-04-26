package com.esprit.devops.repository;

import com.esprit.devops.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country,String> {
}
