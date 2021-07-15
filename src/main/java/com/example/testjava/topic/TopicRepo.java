package com.example.testjava.topic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepo extends JpaRepository<Topic,Integer> {
    public Topic findByName(String name);
}
