package com.company.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "departments")
@ToString
@NamedQuery(name = "Department.findHusenjanDepartment",
        query = "select d from Department d where d.division = ?1")
@NamedNativeQuery(name = "Department.countAllDepartments",
        query = "SELECT * FROM departments",
        resultClass = Department.class)
public class Department {

    @Id
    private String department;
    private String division;
}
