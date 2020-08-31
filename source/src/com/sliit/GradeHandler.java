package com.sliit;

public abstract class GradeHandler {

    protected GradeHandler successor;

    public GradeHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }

    public abstract void processRequest(GradeRequest gradeRequest);
}
