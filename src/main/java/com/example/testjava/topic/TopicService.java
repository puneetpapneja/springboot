package com.example.testjava.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;
    //private TopicRepoWithCrud topicRepo;
   

    public List<Topic> getAll(){
        List<Topic> topics = new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;
    }

    public List<Topic> getAllByCourseId(Integer courseId){
        List<Topic> topics = new ArrayList<>();
        topicRepo.findAllByCourseId(courseId).forEach(topics::add);
        return topics;
    }

    public Topic getById(Integer id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepo.findById(id).get();
    }

    public Topic getByIdAndCourseId(Integer id,Integer courseId){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepo.findByIdAndCourseId(id,courseId);
    }

    public void add(Topic topic){
        //topics.add(topic);
        topicRepo.save(topic);
    }
    
    public List<Topic> getByName(String name){    
        
        return  topicRepo.findAllByName(name);      
    }

    public void update(Topic topic){
        /*for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return ;
            }
        }*/
        topicRepo.save(topic);
    }

    public void delete (Integer id){
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepo.deleteById(id);
    }
}
