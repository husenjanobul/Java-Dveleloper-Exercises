package com.company.services;

import com.company.interfaces.Course;
import lombok.Data;

@Data
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }
}
