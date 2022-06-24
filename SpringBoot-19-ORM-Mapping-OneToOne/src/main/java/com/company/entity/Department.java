package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
public class Department extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long departmentId;

    private String department;
    private String division;

//    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
