package com.example.testjava.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
    @Id
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_course")
    @SequenceGenerator(sequenceName = "seq_course", allocationSize = 1, name = "seq_course")
    //or 
    //@GeneratedValue(strategy = GenerationType.SEQUENCE) by default use HIBERNATE_SEQUENCE 
    private Integer id;

    private String courseName;

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
