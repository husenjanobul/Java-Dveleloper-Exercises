package com.comany.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "departments")
@ToString
public class Department {

    @Id
    private String department;
    private String division;
}
