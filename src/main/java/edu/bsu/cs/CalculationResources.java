package edu.bsu.cs;

import java.util.List;

public class CalculationResources {
    public int compare(List<Integer> grades) {
        int result = 4;
        for (int grade : grades) {
            if (grade < result) {
                result = grade;
            }
        }
        return result;
    }

    public char intToGrade(int grade) {
        if (grade == 4) {
            return 'A';
        } else if (grade == 3) {
            return 'B';
        } else if (grade == 2) {
            return 'C';
        } else if (grade == 1) {
            return 'D';
        } else return 'F';
    }

    public boolean getAssessmentBoolean (String assessmentValue) {
        return assessmentValue.equalsIgnoreCase("yes");
    }
}
