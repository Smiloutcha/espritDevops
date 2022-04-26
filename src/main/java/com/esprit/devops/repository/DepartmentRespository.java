package com.esprit.devops.repository;

import com.esprit.devops.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRespository extends JpaRepository<Department,String> {
}
