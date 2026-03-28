package com.example.Project3.dto.request;

import java.util.List;

public class StudentRequest {
    private String Name;
    private int rollNumber;
    private List<Integer>marks;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public List<Integer> getMarks() {
        return marks;
    }
    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
    

}
