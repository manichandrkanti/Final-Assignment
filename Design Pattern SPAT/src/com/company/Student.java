package com.company;

public class Student extends Observer {
    @Override
    public void update() {
        System.out.println("Your report has been published!");
    }
}
