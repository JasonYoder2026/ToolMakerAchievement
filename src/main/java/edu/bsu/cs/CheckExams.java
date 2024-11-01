package edu.bsu.cs;

public class CheckExams {
    public int getFinalExamGrade(int finalExamSpecs) {
        int finalExamGrade = 1;
        if (finalExamSpecs == 1) {
            finalExamGrade = 4;
        } else if (finalExamSpecs == 2) {
            finalExamGrade = 3;
        } else if (finalExamSpecs ==3) {
            finalExamGrade = 2;
        }
        return finalExamGrade;
    }

    public int getSemesterReportGrade(boolean semesterReportCompletion) {
        int semesterReportGrade = 1;
        if (semesterReportCompletion) {
            semesterReportGrade = 4;
        }
        return semesterReportGrade;
    }
}
