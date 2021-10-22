package com.company;

public class Context {
    private AnalysisOperation analysisOperation;

    public Context(AnalysisOperation analysisOperation) {
        this.analysisOperation = analysisOperation;
    }

    public void performOperation() {
        analysisOperation.performOperation();
    }
}
