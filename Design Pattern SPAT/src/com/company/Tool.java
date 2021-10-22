package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tool {
    private static Tool tool = new Tool();
    private List<Observer> observers = new ArrayList<Observer>();

    private Tool() {
    }

    public static Tool getInstance() {
        return tool;
    }
    public void printMenu(){
        System.out.println("1. Display students marks");
        System.out.println("2. Perform Student analysis operation");
        System.out.println("3. Send performance report to all");
        System.out.println("4. Exit");
    }
    public void displayStudentsGrade(String type){
        StudentFactory studentFactory = new StudentFactory();
        StudentType studentType = studentFactory.getInstance(type);
        studentType.getStudentsGrades();
    }

    public void performAnalysisOperation(int operationType){
        if(operationType == 1){
            Context context = new Context(new MonthlyReport());
            context.performOperation();
        }
        if(operationType == 2){
            Context context = new Context(new StudentTranscript());
            context.performOperation();
        }
        if(operationType == 3){
            Context context = new Context(new SubjectAnalysis());
            context.performOperation();
        }
    }

    public void sendReportToAll(){
        for(int i=0; i<2; i++){
            Observer observer = new Student();
            attach(observer);
        }
        notifyAllObservers();
    }

    private void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
