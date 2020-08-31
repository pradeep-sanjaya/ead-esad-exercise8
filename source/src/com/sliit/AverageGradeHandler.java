package com.sliit;

public class AverageGradeHandler extends GradeHandler {
    @Override
    public void processRequest(GradeRequest gradeRequest) {
        if (gradeRequest.getMarks() >= 40 && gradeRequest.getMarks() < 60 ) {
            System.out.println("Your grade is C for marks =" + gradeRequest.getMarks());
        }

        if (getSuccessor() != null) {
            getSuccessor().processRequest(gradeRequest);
        }
    }
}
