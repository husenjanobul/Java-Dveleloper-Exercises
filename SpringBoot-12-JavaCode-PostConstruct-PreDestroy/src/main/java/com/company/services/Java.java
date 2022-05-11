package com.company.services;

import com.company.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
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
        System.out.println("Teaching hours: 30");
    }
}
