package com.company.services;

import com.company.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int extraHour() {
        return 5;
    }
}
