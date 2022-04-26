package com.esprit.devops.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Department {

    @Id
    private String name ;
    private String description ;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    Collection<Employee> employees ;
    @ManyToOne
    private Country country;



}
