package com.company.entity;

import com.company.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")  // created table name is users
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // postgres automatically add id
    private Long id;
    private String firstName;  // field name in table first_name

    @Column(name = "studentFirstName")  // created table column name
    private String lastName;
    private String email;

    @Transient  // this field(column) doesn't create in table
    private String city;


    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;

    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
