package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckAssignments {
    CheckAssignments assignments = new CheckAssignments();

    @Test
    public void testGetAssignmentGradeWith7() {
        int mockAssignmentsCompleted = 7;
        Assertions.assertEquals(4, assignments.getAssignmentGrade(mockAssignmentsCompleted));
    }

    @Test
    public void testGetAssignmentGradeWith6() {
        int mockAssignmentsCompleted = 6;
        Assertions.assertEquals(3, assignments.getAssignmentGrade(mockAssignmentsCompleted));
    }

    @Test
    public void testGetAssignmentGradeWith5() {
        int mockAssignmentsCompleted = 5;
        Assertions.assertEquals(2, assignments.getAssignmentGrade(mockAssignmentsCompleted));
    }

    @Test
    public void testGetAssignmentGradeWith4() {
        int mockAssignmentsCompleted = 4;
        Assertions.assertEquals(1, assignments.getAssignmentGrade(mockAssignmentsCompleted));
    }

    @Test
    public void testGetAssignmentGradeWith3() {
        int mockAssignmentsCompleted = 3;
        Assertions.assertEquals(0, assignments.getAssignmentGrade(mockAssignmentsCompleted));
    }

}
