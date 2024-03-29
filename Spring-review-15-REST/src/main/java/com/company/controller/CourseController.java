package com.company.controller;

import com.company.dto.CourseDTO;
import com.company.repository.CourseRepository;
import com.company.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // = (@Controller + @ResponseBody) if this annotation available no need to write Method level @ResponseBody annotation
@RequestMapping("/courses/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
//    @ResponseBody
    public List<CourseDTO> getAllCourses(){

        return courseService.getCourses();
    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long id){

        return courseService.getCourseById(id);
    }

    @GetMapping("/category/{name}")
    public List<CourseDTO> getCoursesByCategory(@PathVariable("name") String category){

        return courseService.getCoursesByCategory(category);
    }

    @PostMapping()
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long id,@RequestBody CourseDTO course){
        courseService.updateCourse(id,course);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") Long id) {
        courseService.deleteCourseById(id);
    }

    @DeleteMapping()
    public void deleteCourseById() {
        courseService.deleteCourses();
    }



}
