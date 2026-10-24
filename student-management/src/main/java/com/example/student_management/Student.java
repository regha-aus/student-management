package com.example.student_management;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "student")
public class Student {
    @Id
    private int id;
    @NotBlank(message ="Student name cannot be empty")
    private String name;
    @NotBlank(message= "Course cannot be empty")
    private String course;
    public Student(){   // empty constructor
    }
    public Student(int id, String name, String course){ //Constructor
        this.id =id;
        this.name=name;
        this.course=course;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
}
