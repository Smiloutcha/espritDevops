package com.esprit.devops.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Basic(optional = false)
    private String firstName ;
    @Basic(optional = false)
    private String lastName ;
    @Basic(optional = false)
    private String phoneNumber;
    @Basic(optional = false)
    private String address ;
    @ManyToOne
    private Department department;

}
