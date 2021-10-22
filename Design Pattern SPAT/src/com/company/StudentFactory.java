package com.company;

public class StudentFactory {
    public StudentType getInstance(String type){
        if(type.equals("undergraduate")){
            return new UndergraduateStudents();
        }else{
            return new PostgraduateStudents();
        }
    }
}
