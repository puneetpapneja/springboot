package com.example.testjava.topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAlltopics(){
        return topicService.getAll();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getById(@PathVariable String id){
        return topicService.getById(id);
    }
}
