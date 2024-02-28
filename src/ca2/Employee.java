/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

/**
 *
 * @author Justin
 */

public class Employee {
    // Constructor
    private static int nextEmpNum = 1;
    private String name;
    private String email;
    private int empNum;
    
    // Default
    public Employee() {
        this.name = "Name Surname";
        this.email = "email@example.com";
        this.empNum = nextEmpNum++;
    }
    // With parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getEmpNum() {
        return empNum;
    }
    
    // Setters
    public void setEmail(String email) {
        if (email.length() <= 3) {
            System.out.println("Email address must be longer than 3 characters.");
        } else {
            this.email = email;
        }
    
    }
    
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
    
}
