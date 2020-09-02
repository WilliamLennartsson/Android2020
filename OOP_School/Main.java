package com.devCakeAB;

public class Main {

    public static void main(String[] args) {

        School school = new School();

        Student s1 = new Student("Tommy", 12);
        Student s2 = new Student("Bob", 13);
        Student s3 = new Student("Sara", 14);

        school.addNewStudent(s1);
        school.addNewStudent(s2);
        school.addNewStudent(s3);

        do {
            System.out.println("1. Enter new student");
            System.out.println("2. List all students");
            System.out.println("9. Exit");
            int choice = School.sc.nextInt();
            school.sc.nextLine();
            switch (choice) {
                case 1:
                    school.enterNewStudent();
                    break;
                case 2:
                    school.printAllStudents();
                    break;
                case 9:
                    // System.exit(1);
                    System.out.println("Ha de haj");
                    return;
                default:
                    break;
            }
        } while (true);

    }

}
