package com.company;

public class MonthlyReport implements AnalysisOperation{
    @Override
    public void performOperation() {
        System.out.println("Student last month performance report has been generated!!");
    }
}
