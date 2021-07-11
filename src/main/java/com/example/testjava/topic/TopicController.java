package com.example.testjava.topic;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAlltopics(){
        return Arrays.asList(
            new Topic("1","topic 1","description 1"),
            new Topic("2","topic 2","description 2"),
            new Topic("3","topic 3","description 3")
        );
    }
    
}
