package com.company.services;

import com.company.interfaces.Course;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 30");
    }

}
