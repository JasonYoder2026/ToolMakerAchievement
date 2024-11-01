package edu.bsu.cs;

public class CheckAssignments {
    public int getAssignmentGrade(int completedAssignments) {
        int assignmentsGrade = 0;
        if (completedAssignments == 7) {
            assignmentsGrade = 4;
        } else if (completedAssignments == 6) {
            assignmentsGrade = 3;
        } else if (completedAssignments == 5) {
            assignmentsGrade = 2;
        } else if (completedAssignments == 4) {
            assignmentsGrade = 1;
        }
        return assignmentsGrade;
    }
}
