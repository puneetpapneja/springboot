package com.example.testjava.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.testjava.course.Course;


@Entity
public class Topic {  
    @Id 
    @Column(name = "id", unique = true, nullable = false) 
    private Integer id;
    private String name;
    private String description;
    @ManyToOne
    private Course course;

    public Topic(){

    }

    public Topic(Integer id, String name, String description,Integer courseId){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId,"");
    }

    public Integer getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
