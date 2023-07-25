package com.gradedproject.q1;

class HrDepartment extends SuperDepartment {
    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Team Lunch";
    }

    public String getWorkDeadline() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String doActivity() {
        return "Today is not a holiday";
    }
}
