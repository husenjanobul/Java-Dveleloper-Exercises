package com.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // postgres automatically add id
    private Long id;
    private String firstName;  // field name in table first_name
    private String lastName;
    private String email;

}
