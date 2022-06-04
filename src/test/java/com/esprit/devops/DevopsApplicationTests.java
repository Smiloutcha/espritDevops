package com.esprit.devops;

import com.esprit.devops.model.Country;
import com.esprit.devops.model.Department;
import com.esprit.devops.model.Employee;
import com.esprit.devops.repository.CountryRepository;
import com.esprit.devops.repository.DepartmentRespository;
import com.esprit.devops.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class DevopsApplicationTests {

	@Autowired
	private DepartmentRespository departmentRespository ;
	@Autowired
	private CountryRepository countryRepository ;

	@Test
	void contextLoads() {
		Assertions.assertThat(departmentRespository).isNotNull() ;
		Assertions.assertThat(countryRepository).isNotNull();
	}

	@Test
	public void saveTestCountry() {
		if (countryRepository.count() != 1)
		countryRepository.deleteAll();
		Country country = new Country();
		country.setCountryName("Tunisia");
		countryRepository.save(country);
		long count = countryRepository.count() ;
		Assertions.assertThat(count).isEqualTo(1);
	}

	@Test
	public void saveTestDepartment() {
		countryRepository.deleteAll();
		departmentRespository.deleteAll();
		Country country = new Country();
		country.setCountryName("Tunisia");
		countryRepository.save(country);
		Department department = new Department();
		department.setName("Recherche et Dev");
		department.setCountry(country);
		department.setDescription("Description Du department");
		departmentRespository.save(department);
		long count = departmentRespository.count();
		Assertions.assertThat(count).isEqualTo(1);
	}



}
