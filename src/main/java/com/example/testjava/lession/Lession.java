package com.example.testjava.lession;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.example.testjava.course.Course;
import com.example.testjava.topic.Topic;

@Entity
public class Lession {
    @Id
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    private Topic topic;

    

    public Lession() {
    }

    public Lession(Integer id, String name, Integer courseId, Integer topicId) {
        this.id = id;
        this.name = name;
        this.course = new Course(courseId,"");
        this.topic = new Topic(topicId,"","",courseId);
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
