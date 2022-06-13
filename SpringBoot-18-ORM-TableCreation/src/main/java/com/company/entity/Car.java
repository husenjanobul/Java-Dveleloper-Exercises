package com.company.entity;

import javax.persistence.*;

@Entity // create class name table "car"
@Table(name = "cars") //create "cars" table
public class Car {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String make;
    private String model;
}
