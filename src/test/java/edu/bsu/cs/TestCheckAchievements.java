package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckAchievements {
    CheckAchievements achievements = new CheckAchievements();

    @Test
    public void testGetAchievementsWith8() {
        int mockAchievementsCompleted = 8;
        Assertions.assertEquals(4, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }

    @Test
    public void testGetAchievementsWith6() {
        int mockAchievementsCompleted = 6;
        Assertions.assertEquals(4, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }

    @Test
    public void testGetAchievementsWith5() {
        int mockAchievementsCompleted = 5;
        Assertions.assertEquals(3, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }

    @Test
    public void testGetAchievementsWith4() {
        int mockAchievementsCompleted = 4;
        Assertions.assertEquals(2, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }

    @Test
    public void testGetAchievementsWith3() {
        int mockAchievementsCompleted = 3;
        Assertions.assertEquals(1, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }

    @Test
    public void testGetAchievementsWith2() {
        int mockAchievementsCompleted = 2;
        Assertions.assertEquals(0, achievements.getAchievementsGrade(mockAchievementsCompleted));
    }
}
