package com.company.services;

import com.company.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //field injection
    @Autowired
    private OfficeHours officeHours;

 /*
    //constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

 /*
    //setter injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + officeHours.getHours()));
    }

}
