package com.example.testjava.lession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessionService {
    
    @Autowired
    private LessionRepo lessionRepo;
    public List<Lession> findAll(){
        return lessionRepo.findAll();
    }   

    public List<Lession> findAllByCourseAndTopic(Integer courseId, Integer topicId){
        return lessionRepo.findAllByCourseIdAndTopicId(courseId,topicId);
    }
}
