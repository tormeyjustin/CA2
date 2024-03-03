/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Justin
 */

public class ConsoleMenu {
    public Company company;
    private static String username = "Gnomeo";
    private static String password = "smurf";
    
    // Menu object linked to a specific company
    public ConsoleMenu(Company company) {
        this.company = company;
    }
    
    // Login to the console menu
    public boolean login() {
        boolean authorised = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username:");
        String usernameInput = scanner.nextLine();
        System.out.println("Please enter password:");
        String passwordInput = scanner.nextLine();
        if(usernameInput.equals(username) && passwordInput.equals(password)) {
            authorised = true;   
        } else {
            System.out.println("Incorrect username or password");
        }     
        System.out.println("Login successful");
        return authorised;
    }
    
    // Console menu options
    public int options () {
        Scanner scanner = new Scanner(System.in);
        int selectedOption;
        do {
            System.out.println("Select a number from the following options:");
            System.out.println("> 1. View current staff list");
            System.out.println("> 2. Add staff member");
            System.out.println("> 3. Remove staff member");
            while (!scanner.hasNextInt()) {
                System.out.println("Select a number from 1 to 3");
                scanner.next();
            }
            selectedOption = scanner.nextInt();
        } while (selectedOption < 1 || selectedOption > 3);
        return selectedOption;
    }
    
    // Add staff member menu
    public void addStaff(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        Employee employee = new Employee(name, email);
        company.addNewStaff(employee);
    }
    
    // Remove staff member
    public void removeStaff(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee number:");
        int empNum = scanner.nextInt();
        try {
            company.removeStaff(empNum);
        } catch (Exception e) {
            System.out.println("Error, employee number not found");
        }
    }
}