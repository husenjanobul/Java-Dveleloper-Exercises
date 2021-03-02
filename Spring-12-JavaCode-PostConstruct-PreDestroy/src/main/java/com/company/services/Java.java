package com.company.services;

import com.company.interfaces.Course;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Java implements Course {
    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing PreDestroy");
    }

    @Override
    public void getTeachingHours() {

    }
}
