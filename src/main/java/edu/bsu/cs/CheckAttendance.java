package edu.bsu.cs;

public class CheckAttendance {
    public int getAttendanceGrade(int numClassesAttended) {
        int attendanceGrade = 0;
        if (numClassesAttended >= 24) {
            attendanceGrade = 4;
        } else if (numClassesAttended >= 22) {
            attendanceGrade = 3;
        } else if (numClassesAttended >= 19) {
            attendanceGrade = 2;
        } else if (numClassesAttended >= 16) {
            attendanceGrade = 1;
        }
        return attendanceGrade;
    }
}
