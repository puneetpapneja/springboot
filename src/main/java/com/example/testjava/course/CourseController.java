package com.example.testjava.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public List<Course> getAll(){
        return courseService.getAll();
    }

    
    @PostMapping("/course")
    public Course add(@RequestBody Course course){
        return courseService.addUpdate(course);
    }

    @PutMapping("/course")
    public Course update(@RequestBody Course course){
        return courseService.addUpdate(course);
    }
    
    @DeleteMapping("/course/{id}")
    public void delete(@PathVariable Integer id){
        courseService.delete(id);
    }
}
