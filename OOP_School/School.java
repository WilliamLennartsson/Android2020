package com.devCakeAB;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void addNewStudent(Student s) {
        students.add(s);
    }
    public void enterNewStudent() {
        System.out.println("Enter name for student");
        String studentName = sc.nextLine();
        System.out.println("Enter age for student");
        int studentAge = sc.nextInt();
        sc.nextLine();
        Student student = new Student(studentName, studentAge);
        addNewStudent(student);
    }
    public void addNewTeacher() { }

    public void assignTeacherToCourse() {}

    public void printAllStudents() {
        for (Student s: students) {
            System.out.println(s);
        }
    }



}
