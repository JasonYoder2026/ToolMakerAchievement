package edu.bsu.cs;

public class CheckIterations {
    public int getAllButLastIterationGrades(String iterationLevel) {
        int iterationGrade = 3;
        if (iterationLevel.equalsIgnoreCase("master") || iterationLevel.equalsIgnoreCase("proficient") || iterationLevel.equalsIgnoreCase("starter")) {
            iterationGrade = 4;
        }
        return iterationGrade;
    }

    public int getFinalProjectLastIterationGrade(String iterationLevel) {
        int iterationGrade = 0;
        if(iterationLevel.equalsIgnoreCase("master")) {
            iterationGrade = 4;
        } else if (iterationLevel.equalsIgnoreCase("proficient")) {
            iterationGrade = 3;
        } else if (iterationLevel.equalsIgnoreCase("starter")) {
            iterationGrade = 2;
        }
        return iterationGrade;
    }
}
