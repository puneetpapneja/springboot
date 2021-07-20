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

    @ManyToOne
    private Course course;

    @ManyToOne
    private Topic topic;

    

    public Lession() {
    }

    public Lession(Integer id, String name) {
        this.id = id;
        this.name = name;        
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


    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
