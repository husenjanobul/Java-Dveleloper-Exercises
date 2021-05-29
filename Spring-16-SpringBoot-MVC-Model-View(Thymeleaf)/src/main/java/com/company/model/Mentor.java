package com.company.model;

import com.company.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Mentor {

    private String firstName;
    private String lastName;
    private int age;

    private Gender gender;

}
