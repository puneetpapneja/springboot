package com.example.testjava.topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


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


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void add(@RequestBody Topic topic){
        topicService.add(topic);
    }
}
