package com.company;

public class PostgraduateStudents implements StudentType{
    @Override
    public void getStudentsGrades() {
        String[] grades = {"B-", "C", "A", "A-", "A+", "B+"};
        System.out.println("Postgraduate students grades list:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
