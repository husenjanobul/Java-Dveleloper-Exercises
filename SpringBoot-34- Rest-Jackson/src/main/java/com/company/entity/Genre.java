package com.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList = new ArrayList<>();

    public Genre(String name) {
        this.name = name;
    }
}
