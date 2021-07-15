package com.example.testjava.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepo courseRepo;
    
    public List<Course> getAll(){        
        return courseRepo.findAll();
    }

    public Course getById(Integer id){        
        return courseRepo.findById(id).get();
    }

    public Course addUpdate(Course course){
        return courseRepo.save(course);
    }

    public void delete(Integer id){
        courseRepo.deleteById(id);
    }
    
}
