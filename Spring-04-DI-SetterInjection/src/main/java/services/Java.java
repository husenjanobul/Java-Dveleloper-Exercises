package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

//   private OfficeHours officeHours;
    //or
    private  ExtraSessions extraSessions;



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (30+ extraSessions.getHours()));
    }
}
