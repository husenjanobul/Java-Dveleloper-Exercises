package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.Data;

public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 30");
    }
}
