package com.company;

public class UndergraduateStudents implements StudentType {
    @Override
    public void getStudentsGrades() {
        String[] grades = {"B", "C-", "A+", "A", "B-", "B+"};
        System.out.println("Undergraduate students grades list:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
