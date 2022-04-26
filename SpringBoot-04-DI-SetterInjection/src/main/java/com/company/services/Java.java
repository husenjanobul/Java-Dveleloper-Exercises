package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private ExtraSessions extraSessions;
//    private OfficeHours officeHours;

    /*
    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30+ extraSessions.getHours()));
    }
}
