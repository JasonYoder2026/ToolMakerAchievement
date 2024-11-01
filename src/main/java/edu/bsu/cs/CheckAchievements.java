package edu.bsu.cs;

public class CheckAchievements {
    public int getAchievementsGrade(int completedAchievements) {
        int achievementsGrade = 0;
        if (completedAchievements >= 6) {
            achievementsGrade = 4;
        } else if (completedAchievements == 5) {
            achievementsGrade = 3;
        } else if (completedAchievements == 4) {
            achievementsGrade = 2;
        } else if (completedAchievements == 3) {
            achievementsGrade = 1;
        }
        return achievementsGrade;
    }
}
