package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

  /*
    @Autowired
//    @Qualifier("officeHours")
    @Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions;
   */

    private ExtraSessions extraSessions;
//    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30 + extraSessions.getHours()));
    }

}
