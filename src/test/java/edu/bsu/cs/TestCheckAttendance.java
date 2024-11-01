package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckAttendance {
    CheckAttendance attendance = new CheckAttendance();

    @Test
    public void checkGetAttendanceWith28() {
        int mockClassesAttended = 28;
        Assertions.assertEquals(4, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith24() {
        int mockClassesAttended = 24;
        Assertions.assertEquals(4, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith23() {
        int mockClassesAttended = 23;
        Assertions.assertEquals(3, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith22() {
        int mockClassesAttended = 22;
        Assertions.assertEquals(3, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith20() {
        int mockClassesAttended = 20;
        Assertions.assertEquals(2, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith19() {
        int mockClassesAttended = 19;
        Assertions.assertEquals(2, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith18() {
        int mockClassesAttended = 18;
        Assertions.assertEquals(1, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith16() {
        int mockClassesAttended = 16;
        Assertions.assertEquals(1, attendance.getAttendanceGrade(mockClassesAttended));
    }

    @Test
    public void checkGetAttendanceWith14() {
        int mockClassesAttended = 14;
        Assertions.assertEquals(0, attendance.getAttendanceGrade(mockClassesAttended));
    }
}
