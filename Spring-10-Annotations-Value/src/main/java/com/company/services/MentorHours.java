package com.company.services;

import com.company.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MentorHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 3;
    }
}
