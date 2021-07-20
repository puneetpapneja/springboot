package com.example.testjava.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepoWithCrud extends CrudRepository<Topic,Integer> {
    public List<Topic> findAllByName(String name);
    public List<Topic> findAllByCourseId(Integer courseId);
}
