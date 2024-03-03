/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.ArrayList;

/**
 *
 * @author Justin
 */
public class EmployeeTest {

    public static void main(String[] args) {

        // Create three Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ana Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Create projectGroup array
        ArrayList<Employee> projectGroup = new ArrayList<Employee>();

        // Add each Employee object to projectGroup array
        projectGroup.add(emp1);
        projectGroup.add(emp2);
        projectGroup.add(emp3);

        // Print the value of nextEmpNum
        System.out.println(Employee.getNextEmpNum());

        int m = 1;

        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
        
        // More tests
        // Create company
        System.out.println("Create company");
        Company testcorp = new Company();
        
        // Add Employees
        System.out.println("> Add 2 Employees:");
        testcorp.addNewStaff(emp1);
        testcorp.addNewStaff(emp2);
        
        // Count employees
        System.out.println("> Number of employees:");
        System.out.println(testcorp.getStaffNumber());
        System.out.println("> List employees:");
        testcorp.listEmployees(0);
        
        // Remove employee
        System.out.println("> Remove 1 Employee:");
        testcorp.removeStaff(1);
        System.out.println("> List employees:");
        testcorp.listEmployees(0);
        
        // Add another
        System.out.println("> Add 1 Employee:");
        testcorp.addNewStaff(emp3);
        testcorp.listEmployees(0);
        
        // Count employees
        System.out.println("> Number of employees:");
        System.out.println(testcorp.getStaffNumber());
        
        // Add a manager
        Manager manager1 = new Manager(emp1, "username", "password");
        System.out.println("> List employees:");
        testcorp.listEmployees(0);
    }

}
