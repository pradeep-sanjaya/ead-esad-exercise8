package com.sliit;

public class BestGradeHandler extends GradeHandler {
    @Override
    public void processRequest(GradeRequest gradeRequest) {
        if (gradeRequest.getMarks() >= 80 && gradeRequest.getMarks() <= 100 ) {
            System.out.println("Your grade is A for marks =" + gradeRequest.getMarks());
        }

        if (getSuccessor() != null) {
            getSuccessor().processRequest(gradeRequest);
        }
    }
}
