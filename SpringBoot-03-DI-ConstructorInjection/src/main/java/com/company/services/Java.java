package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSessions;

public class Java implements Course {

    ExtraSessions extraSessions;
    public Java(OfficeHours officeHours) {
        this.extraSessions = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30+ extraSessions.getHours()));
    }
}
