package com.example.testjava.topic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepo extends JpaRepository<Topic,Integer> {
    public List<Topic> findAllByName(String name);
    public List<Topic> findAllByCourseId(Integer courseId);
    public Topic findByIdAndCourseId(Integer id, Integer courseId);
}
