package com.sliit;

public class MeritGradeHandler extends GradeHandler {
    @Override
    public void processRequest(GradeRequest gradeRequest) {
        if (gradeRequest.getMarks() >= 60 && gradeRequest.getMarks() < 80 ) {
            System.out.println("Your grade is B for marks =" + gradeRequest.getMarks());
        }

        if (getSuccessor() != null) {
            getSuccessor().processRequest(gradeRequest);
        }
    }
}
