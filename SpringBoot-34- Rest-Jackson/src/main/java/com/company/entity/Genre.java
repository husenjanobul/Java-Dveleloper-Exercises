package com.company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genreList")
    @JsonIgnore
    private List<Movie> movieList = new ArrayList<>();

    public Genre(String name) {
        this.name = name;
    }
}
