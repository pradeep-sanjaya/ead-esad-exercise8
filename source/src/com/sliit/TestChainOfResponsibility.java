package com.sliit;

import java.util.Scanner;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        BestGradeHandler bestGradeHandler = new BestGradeHandler();
        MeritGradeHandler meritGradeHandler = new MeritGradeHandler();
        AverageGradeHandler averageGradeHandler = new AverageGradeHandler();
        FailGradeHandler failGradeHandler = new FailGradeHandler();

        bestGradeHandler.setSuccessor(meritGradeHandler);
        meritGradeHandler.setSuccessor(averageGradeHandler);
        averageGradeHandler.setSuccessor(failGradeHandler);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nExter marks for grade = ");
            int marks = scanner.nextInt();
            bestGradeHandler.processRequest(new GradeRequest(marks));
        }

    }
}