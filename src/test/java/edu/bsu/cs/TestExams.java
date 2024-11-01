package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExams {
    CheckExams exams = new CheckExams();

    @Test
    public void testGetSemesterReportGradeTrue() {
        boolean mockSemesterReportCompletion = true;
        Assertions.assertEquals(4, exams.getSemesterReportGrade(mockSemesterReportCompletion));
    }

    @Test
    public void testGetSemesterReportGradeFalse() {
        boolean mockSemesterReportCompletion = false;
        Assertions.assertEquals(1, exams.getSemesterReportGrade(mockSemesterReportCompletion));
    }

    @Test
    public void testGetFinalExamGradeWith1() {
        int mockFinalExamSpecs = 1;
        Assertions.assertEquals(4, exams.getFinalExamGrade(mockFinalExamSpecs));
    }

    @Test
    public void testGetFinalExamGradeWith2() {
        int mockFinalExamSpecs = 2;
        Assertions.assertEquals(3, exams.getFinalExamGrade(mockFinalExamSpecs));
    }

    @Test
    public void testGetFinalExamGradeWith3() {
        int mockFinalExamSpecs = 3;
        Assertions.assertEquals(2, exams.getFinalExamGrade(mockFinalExamSpecs));
    }

    @Test
    public void testGetFinalExamGradeWith4() {
        int mockFinalExamSpecs = 4;
        Assertions.assertEquals(1, exams.getFinalExamGrade(mockFinalExamSpecs));
    }
}
