package com.company;

//Student performance and analytic tool
//Singleton ✅
//Factory ✅
//Strategy ✅
//Observer ✅

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tool tool = Tool.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            tool.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                System.out.println("Select students category:");
                System.out.println("1. Undergraduate students");
                System.out.println("2. Postgraduate students");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    tool.displayStudentsGrade("undergraduate");
                } else {
                    tool.displayStudentsGrade("postgraduate");
                }
            }
            if (option == 2) {
                System.out.println("Select report type you want to generate:");
                System.out.println("1. Generate student last month performance report");
                System.out.println("2. Generate student transcript");
                System.out.println("3. Generate student strong subjects analysis");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    tool.performAnalysisOperation(1);
                }
                if (selection == 2) {
                    tool.performAnalysisOperation(2);
                }
                if (selection == 3) {
                    tool.performAnalysisOperation(3);
                }
            }
            if (option == 3){
                tool.sendReportToAll();
            }
        }
    }
}
