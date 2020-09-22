package com.devCakeAB;

import java.util.ArrayList;

// -- EmployeeSystem --
public class EmployeeSystem {
    // list of employees
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // TODO: A way to keep the program running until exited DONE
    // TODO: Menu system DONE

    // TODO: Method to update employee. What variables on Employee? Overloading?
    // TODO: Helper method to find an employee by id
    // TODO: Save Employees to a file
    // TODO: Read Employees from file

    // add employee
    public void addEmployee(String name, int age){
        // Create a new employee
        Employee e = new Employee(name, age);
        // Add the employee to our list
        employeeList.add(e);
        System.out.println(e + " was added");
    }

    // remove employee
    public void removeEmployee(int workId) {
        // Edgecase. If workId < 0 there's no need to continue
        if (workId < 0) return;
        // Loop through all employees
        for(Employee e: employeeList) {
            // Check if the passed id (workId) is equal to the id of the employee
            if (e.getWorkId() == workId) {
                // If it is. We found the right employee since the id is unique
                System.out.println(e + " was removed");
                employeeList.remove(e);
                // After we found one employee we know we cannot find another one (ids are unique in our case)
                // So we are done. We can return
                return;
            }
        }
        // We will never get here if we found an employee. Because we return after we do
        System.out.println("Employee with id " + workId + " was not found");
    }

    // Add new skill to employee
    public void addSkillToEmployee(int id, String newSkill) {
        // Loop through all employees
        for(Employee e: employeeList) {
            // Same as above. Find the employee we want
            if (e.getWorkId() == id) {
                // Found an employee with correct id
                // Use getter to store the skills of an employee in a variable
                ArrayList<String> employeeSkills = e.getSkills();
                // use that arrayList to add a new skill
                employeeSkills.add(newSkill);
                System.out.println(newSkill + " added to employee " + e);
                return;
            }
        }
        System.out.println("Employee with id " + id + " was not found");
    }

    public void printAllEmployees() {
        System.out.println("-- All Employees --");
        // Loop through all employees
        for(Employee e: employeeList) {
            // Print employee
            System.out.println(e);
            // Get employee skills
            ArrayList<String> employeeSkills = e.getSkills();
            // employeeSkills === e.getSkills()
            System.out.println("Skills: " + employeeSkills);
//            Manual way. Looping through skills of all employees and prints
//            System.out.println("Skills: ");
//            for(String skill: employeeSkills) {
//                System.out.print(skill + " ");
//            }
//            System.out.println();
        }
        System.out.println("-- END --");
    }
}
