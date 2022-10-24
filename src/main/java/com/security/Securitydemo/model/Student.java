package com.security.Securitydemo.model;

public class Student {
    private int studentID;
    private String StudentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        StudentName = studentName;
    }

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
