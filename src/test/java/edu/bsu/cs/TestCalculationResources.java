package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalculationResources {
    CalculationResources resources = new CalculationResources();

    @Test
    public void testCompare() {
        List<Integer> mockGrades = new ArrayList<>();
        mockGrades.add(4);
        mockGrades.add(2);
        mockGrades.add(3);

        Assertions.assertEquals(2, resources.compare(mockGrades));
    }

    @Test
    public void testCompareAll4s() {
        List<Integer> mockGrades = new ArrayList<>();
        mockGrades.add(4);
        mockGrades.add(4);
        mockGrades.add(4);

        Assertions.assertEquals(4, resources.compare(mockGrades));
    }

    @Test
    public void testIntToGradeWithFour() {
        int mockIntGrade = 4;

        Assertions.assertEquals('A', resources.intToGrade(mockIntGrade));
    }

    @Test
    public void testIntToGradeWithThree() {
        int mockIntGrade = 3;

        Assertions.assertEquals('B', resources.intToGrade(mockIntGrade));
    }

    @Test
    public void testIntToGradeWithTwo() {
        int mockIntGrade = 2;

        Assertions.assertEquals('C', resources.intToGrade(mockIntGrade));
    }

    @Test
    public void testIntToGradeWithOne() {
        int mockIntGrade = 1;

        Assertions.assertEquals('D', resources.intToGrade(mockIntGrade));
    }

    @Test
    public void testIntToGradeWithZero() {
        int mockIntGrade = 0;

        Assertions.assertEquals('F', resources.intToGrade(mockIntGrade));
    }

    @Test
    public void testGetAssessmentBooleanYes() {
        String mockAnswer = "yes";

        Assertions.assertTrue(resources.getAssessmentBoolean(mockAnswer));
    }

    @Test
    public void testGetAssessmentBooleanCapitalYes() {
        String mockAnswer = "Yes";

        Assertions.assertTrue(resources.getAssessmentBoolean(mockAnswer));
    }

    @Test
    public void testGetAssessmentBooleanNo() {
        String mockAnswer = "no";

        Assertions.assertFalse(resources.getAssessmentBoolean(mockAnswer));
    }
}
