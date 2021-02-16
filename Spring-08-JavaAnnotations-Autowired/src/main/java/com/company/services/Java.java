package com.company.services;

import com.company.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    //Field Injection
     private OfficeHours officeHours;

    //Constructor Injection
//    @Autowired // optional for constructor
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    //Setter Injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + officeHours.getHours()));
    }

}
