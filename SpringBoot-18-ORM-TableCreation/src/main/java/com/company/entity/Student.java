package com.company.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate id automatically
    private Long studentId;

    @Column(name = "studentFirstName") //change column name
    private String firstName;
    private String lastName;
    private String email;

    @Transient // hide column , doesn't exist in the table
    private String city;


    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;

//java8
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;
//or
    @Column(columnDefinition = "DATE")
    private LocalDate localDate1;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime1;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime1;

}
