package com.esprit.devops.service;

import com.esprit.devops.model.Employee;
import com.esprit.devops.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private static final String MESSAGE = "THE MESSAGE";


    @Override
    public Employee save(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public Collection<Employee> findAll() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee deleteById(Long id) {
        Employee employeeToRemove = employeeRepository.findById(id).orElse(null);
        if (employeeToRemove != null) {
            employeeRepository.deleteById(id);
            return employeeToRemove;
        } else {
            throw new RuntimeException("No Employee to save");
        }
    }

    @Override
    public void deleteAll() {
       employeeRepository.deleteAll();
    }
}
