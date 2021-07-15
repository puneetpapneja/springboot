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
    public Topic getById(@PathVariable Integer id){
        return topicService.getById(id);
    }

    @RequestMapping("/topicByName/{name}")
    public List<Topic> getByNames(@PathVariable String name){
        return topicService.getByName(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void add(@RequestBody Topic topic){
        topicService.add(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void update(@RequestBody Topic topic){
        topicService.update(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void delete(@PathVariable Integer id){
        topicService.delete(id);
    }
}
