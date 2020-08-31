package com.sliit;

public class FailGradeHandler extends GradeHandler {
    @Override
    public void processRequest(GradeRequest gradeRequest) {
        if (gradeRequest.getMarks() < 40) {
            System.out.println("You fail the module for marks =" + gradeRequest.getMarks());
        }
    }
}
