package com.example.testjava.topic;
import java.util.List;

import com.example.testjava.course.Course;

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
    
    @RequestMapping("/topic/{id}")
    public Topic getById(@PathVariable Integer id){
        return topicService.getById(id);
    }

    @RequestMapping("/course/{courseId}/topic/{id}")
    public Topic getById(@PathVariable Integer id,@PathVariable Integer courseId){
        return topicService.getByIdAndCourseId(id,courseId);
    }

    @RequestMapping("/topicByName/{name}")
    public List<Topic> getByNames(@PathVariable String name){
        return topicService.getByName(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/course/{id}/topic")
    public void add(@RequestBody Topic topic, @PathVariable Integer id){
        topic.setCourse(new Course(id,""));
        topicService.add(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/course/{id}/topic")
    public void update(@RequestBody Topic topic, @PathVariable Integer id){
        topic.setCourse(new Course(id,""));
        topicService.update(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void delete(@PathVariable Integer id){
        topicService.delete(id);
    }

    @RequestMapping("/course/{id}/topics")
    public List<Topic> getAllByCourseId(@PathVariable Integer id){
        return topicService.getAllByCourseId(id);
    }
}
