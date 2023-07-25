package com.gradedproject.q1;

public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDept = new AdminDepartment();
        HrDepartment hrDept = new HrDepartment();
        TechDepartment techDept = new TechDepartment();

        // Display Admin Department functionalities
        System.out.println("Welcome to " + adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());

        // Display HR Department functionalities
        System.out.println("\nWelcome to " + hrDept.departmentName());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());

        // Display Tech Department functionalities
        System.out.println("\nWelcome to " + techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());
    }
}
