package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSessions;

public class Java implements Course {

    private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30+ officeHours.getHours()));
    }
}
