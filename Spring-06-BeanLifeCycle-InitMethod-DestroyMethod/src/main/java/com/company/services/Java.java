package com.company.services;

import com.company.interfaces.Course;

public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 30");
    }

    public void myInitMethod(){
        System.out.println("Executing initMethod");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroyMethod");
    }
}
