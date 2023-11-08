package com.company.repository;


import org.springframework.stereotype.Component;

@Component
public class RegularRepository implements HoursRepository {
    @Override
    public int getHours() {
        return 40;
    }
}
