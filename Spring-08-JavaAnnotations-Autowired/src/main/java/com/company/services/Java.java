package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    //Field Injection
     private ExtraSessions extraSessions;

    //Constructor Injection
//    @Autowired // optional for constructor
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }


    //Setter Injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + extraSessions.getHours()));
    }

}
