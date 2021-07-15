package com.example.testjava.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {
    public List<Course> findAllByCourseNameIgnoreCase(String courseName);
}
