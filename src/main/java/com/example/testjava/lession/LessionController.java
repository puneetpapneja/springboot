package com.example.testjava.lession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessionController {
    
    @Autowired
    private LessionService lessionService;

    @GetMapping("/lession")
    public List<Lession> getAll(){
        return lessionService.findAll();
    }

    @GetMapping("/course/{courseId}/topic/{topicId}/lession")
    public List<Lession> getAll(@PathVariable Integer courseId, @PathVariable Integer topicId){
        return lessionService.findAllByCourseAndTopic(courseId, topicId);
    }
}
