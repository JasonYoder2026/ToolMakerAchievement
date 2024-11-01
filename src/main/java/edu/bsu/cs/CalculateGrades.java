package edu.bsu.cs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateGrades {
    public void start() {
        List<Integer> grades = new ArrayList<>();
        List<Integer> iterationGrades = calculateIterations();
        CalculationResources resources = new CalculationResources();

        grades.add(calculateAttendance());
        grades.add(calculateAssignments());
        grades.add(calculateAchievements());
        grades.add(calculateMidSemReport());
        grades.addAll(iterationGrades);
        grades.add(calculateFinalExam());

        int lowestGrade = resources.compare(grades);
        char finalGrade = resources.intToGrade(lowestGrade);
        System.out.printf("\n\nThe final grade for the student is: %s", finalGrade);
    }

    private int calculateAttendance() {
        Scanner sc = new Scanner(System.in);
        CheckAttendance attendance = new CheckAttendance();

        System.out.println("How many classes did this student attend?");
        int classesAttended = Integer.parseInt(sc.nextLine());
        return attendance.getAttendanceGrade(classesAttended);
    }

    private int calculateAssignments() {
        Scanner sc = new Scanner(System.in);
        CheckAssignments assignments = new CheckAssignments();

        System.out.println("How many assignments did this student complete?");
        int assignmentsCompleted = Integer.parseInt(sc.nextLine());
        return assignments.getAssignmentGrade(assignmentsCompleted);
    }

    private int calculateAchievements() {
        Scanner sc = new Scanner(System.in);
        CheckAchievements achievements = new CheckAchievements();

        System.out.println("How many achievements did this student complete?");
        int achievementsCompleted = Integer.parseInt(sc.nextLine());
        return achievements.getAchievementsGrade(achievementsCompleted);
    }

    private int calculateMidSemReport() {
        Scanner sc = new Scanner(System.in);
        CheckExams report = new CheckExams();
        CalculationResources resources = new CalculationResources();

        System.out.println("Did this student do their Mid-Semester Self-Assessment Report? (yes or no)");
        String assessmentValue = sc.nextLine();
        boolean assessmentBooleanValue = resources.getAssessmentBoolean(assessmentValue);

        return report.getSemesterReportGrade(assessmentBooleanValue);
    }

    private List<Integer> calculateIterations() {
        Scanner sc = new Scanner(System.in);
        CheckIterations iterations = new CheckIterations();
        List<Integer> iterationGrades = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            System.out.println("This student's level for the first project iteration " + i + " was: (master, proficient, starter, or unassessable");
            iterationGrades.add(iterations.getAllButLastIterationGrades(sc.nextLine()));
        }

        for (int i = 1; i < 3; i++) {
            System.out.println("This student's level for the final project iteration " + i + " was: (master, proficient, starter, or unassessable");
            iterationGrades.add(iterations.getAllButLastIterationGrades(sc.nextLine()));
        }

        System.out.println("This student's level for the first project iteration 3 was: (master, proficient, starter, or unassessable");
        iterationGrades.add(iterations.getFinalProjectLastIterationGrade(sc.nextLine()));

        return iterationGrades;
    }

    private int calculateFinalExam() {
        Scanner sc = new Scanner(System.in);
        CheckExams exam = new CheckExams();

        System.out.println("This student's final exam: \n1)Meets full expectations \n2)Nearly meets full expectations \n3)Meets minimum expectations \n4)Does not meet specifications\n(Enter the corisponding number)");
        return exam.getFinalExamGrade(Integer.parseInt(sc.nextLine()));
    }


}
