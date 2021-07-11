package com.example.testjava.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
        new Topic("1","topic 1","description 1"),
        new Topic("2","topic 2","description 2"),
        new Topic("3","topic 3","description 3")
    );

    public List<Topic> getAll(){
        return topics;
    }

    public Topic getById(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
