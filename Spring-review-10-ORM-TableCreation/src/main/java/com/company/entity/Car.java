package com.company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String made;

    public Car(String make, String made) {
        this.make = make;
        this.made = made;
    }
}
