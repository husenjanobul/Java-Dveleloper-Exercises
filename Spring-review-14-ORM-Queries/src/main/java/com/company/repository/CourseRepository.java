package com.company.repository;

import com.company.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //Derive Query
    //find all courses by category
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //check if a course with the provided name exist. if exist return true, otherwise return false
    boolean existsByName(String name);


}
