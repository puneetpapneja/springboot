package com.example.testjava.lession;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessionRepo extends JpaRepository<Lession,Integer> {
    public List<Lession> findAllByCourseIdAndTopicId(Integer courseId,Integer topicId);
}
