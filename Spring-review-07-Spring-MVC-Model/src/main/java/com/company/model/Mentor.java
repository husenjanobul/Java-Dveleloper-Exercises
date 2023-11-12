package com.company.model;

import com.company.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String firstName;
    private String latName;
    private int age;
    private Gender gender;

}
