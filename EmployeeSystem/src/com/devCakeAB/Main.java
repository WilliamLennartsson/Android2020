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

        // -- Test data / Testing methods --
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
        // Prints all employees. no args
        system.printAllEmployees();


        // Menu. Loop forever (or until we exit)
        while(true) {
            // Print menu
            printMenu();
            // Get user input. Save in choice
            int choice = sc.nextInt();
            sc.nextLine();
            // Switch the choice
            switch(choice) {
                case 1:
                    // User choice == 1. Add new employee
                    // Ask user to enter the name and age of the new employee
                    System.out.println("Enter name of new employee");
                    String employeeName = sc.nextLine();
                    System.out.println("Enter age of new employee");
                    int employeeAge = sc.nextInt();
                    // Add the employee with the information from the user
                    system.addEmployee(employeeName, employeeAge);
                    break;
                case 2:
                    // User choice == 2. Ask user to enter ID and remove that user.
                    System.out.println("Enter ID of employee you wish to remove");
                    int id = sc.nextInt();
                    system.removeEmployee(id);
                    break;
                case 3:
                    // User choice == 3. Ask user to enter ID
                    System.out.println("Enter ID of employee you wish to add a new skill to");
                    int workId = sc.nextInt();
                    sc.nextLine();
                    // Ask user to enter a new skill.
                    System.out.println("Enter the skill you wish to add");
                    String newSkill = sc.nextLine();
                    // Add the new skill to the given employee
                    system.addSkillToEmployee(workId, newSkill);
                    break;
                case 4:
                    // User choice == 4. Print all employees
                    system.printAllEmployees();
                    break;
                case 0:
                    // User choice == 0. Exit
                    System.out.println("Shutting down..");
                    System.exit(0);
                    return;
                default:
                    // User choice is none of the above.
                    System.out.println("Wrong input..");
                    break;
            }
        }
    }

    // Method to print menu
    public static void printMenu() {
        System.out.println("-- Menu --");
        System.out.println("1. Add new employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Add new skill to employee");
        System.out.println("4. Print all employees");
        System.out.println("0. Exit");
    }

}
