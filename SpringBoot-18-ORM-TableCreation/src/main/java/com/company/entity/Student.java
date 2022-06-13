package com.company.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate id automatically
    private Long studentId;

    private String firstName;
    private String lastName;
    private String email;

}
