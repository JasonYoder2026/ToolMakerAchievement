package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckIterations {
    CheckIterations iterations = new CheckIterations();

    @Test
    public void testGetAllButLastIterationGradesMaster() {
        String mockIterationLevel = "master";
        Assertions.assertEquals(4, iterations.getAllButLastIterationGrades(mockIterationLevel));
    }

    @Test
    public void testGetAllButLastIterationGradesProficient() {
        String mockIterationLevel = "proficient";
        Assertions.assertEquals(4, iterations.getAllButLastIterationGrades(mockIterationLevel));
    }

    @Test
    public void testGetAllButLastIterationGradesStarter() {
        String mockIterationLevel = "starter";
        Assertions.assertEquals(4, iterations.getAllButLastIterationGrades(mockIterationLevel));
    }

    @Test
    public void testGetAllButLastIterationGradesUnassessable() {
        String mockIterationLevel = "unassessable";
        Assertions.assertEquals(3, iterations.getAllButLastIterationGrades(mockIterationLevel));
    }

    @Test
    public void testGetFinalProjectLastIterationGradeMaster() {
        String mockIterationLevel = "master";
        Assertions.assertEquals(4, iterations.getFinalProjectLastIterationGrade(mockIterationLevel));
    }

    @Test
    public void testGetFinalProjectLastIterationGradeProficient() {
        String mockIterationLevel = "proficient";
        Assertions.assertEquals(3, iterations.getFinalProjectLastIterationGrade(mockIterationLevel));
    }

    @Test
    public void testGetFinalProjectLastIterationGradeStarter() {
        String mockIterationLevel = "starter";
        Assertions.assertEquals(2, iterations.getFinalProjectLastIterationGrade(mockIterationLevel));
    }

    @Test
    public void testGetFinalProjectLastIterationGradeUnassessable() {
        String mockIterationLevel = "unassessable";
        Assertions.assertEquals(0, iterations.getFinalProjectLastIterationGrade(mockIterationLevel));
    }
}
