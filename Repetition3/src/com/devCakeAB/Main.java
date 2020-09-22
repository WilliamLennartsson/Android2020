package com.devCakeAB;

import java.util.Scanner;

public class Main {

    // System för att hålla koll på anställda
    // Lägga in en anställd DONE
    // Ta bort en anställd DONE
    // Uppdatera en anställd

    // Programmet ska vara igång tills en användare vill stänga av programmet
    // Menysystem som ska låta en användare :
    //      Mata in nya anställd
    //      Ta bort en anställd
    //      Uppdatera en anställd
    //      Lista alla anställda

    // -- Employee --
    // name
    // age
    // workId
    // areaOfExpertise

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -- EmployeeSystem --
        EmployeeSystem system = new EmployeeSystem();
        // list of employees
        // add employee. args = (String, int)
        system.addEmployee("Will", 14);
        system.addEmployee("Oleg", 20);
        system.addEmployee("Vio", 34);
        // remove employee. args = (int workId)
        system.removeEmployee(2);
        system.removeEmployee(7);
        // update employee
        // Add new skill to employee. args = (int workId, String newSkill)
        system.addSkillToEmployee(1, "IT wizard");
        system.addSkillToEmployee(1, "App dev");
        system.addSkillToEmployee(3, "Database pro");

        // Prints all new employees. no args
        system.printAllEmployees();

        while(true) {
            // Print menu
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("Enter name of new employee");
                    String employeeName = sc.nextLine();
                    System.out.println("Enter age of new employee");
                    int employeeAge = sc.nextInt();
                    system.addEmployee(employeeName, employeeAge);
                    break;
                case 2:
                    System.out.println("Enter ID of employee you wish to remove");
                    int id = sc.nextInt();
                    system.removeEmployee(id);
                    break;
                case 3:
                    System.out.println("Enter ID of employee you wish to add a new skill to");
                    int workId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the skill you wish to add");
                    String newSkill = sc.nextLine();
                    system.addSkillToEmployee(workId, newSkill);
                    break;
                case 4:
                    system.printAllEmployees();
                    break;
                case 0:
                    System.out.println("Shutting down..");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Wrong input..");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("-- Menu --");
        System.out.println("1. Add new employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Add new skill to employee");
        System.out.println("4. Print all employees");
        System.out.println("0. Exit");
    }

}
