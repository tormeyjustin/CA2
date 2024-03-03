/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Justin
 */

public class Company {
    // Constructor
    private String companyName;
    private ArrayList<Employee> staff;
    
    // Default
    public Company() {
        this.companyName = "";
        this.staff = new ArrayList<Employee>();
    }
    
    // With parameter
    public Company(String name) {
        this.companyName = name;
        this.staff = new ArrayList<Employee>();
    }
    
    // Add new staff member
    public void addNewStaff(Employee employee) {
        this.staff.add(employee);     
    }
    
    // Add a manager
    public void addNewStaff(Manager manager, String username, String password) {
        this.staff.add(manager); 
    }
    
    // Get the number of employees
    public int getStaffNumber() {
        return this.staff.size();
    }
    
    // Remove staff member
    public void removeStaff(int empNum) {
        // Iterator
        Iterator<Employee> iterator = this.staff.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if(emp.getEmpNum() == empNum) {
                iterator.remove();
            }
        }
    }
    
    // Print a list of all current employees
    public void listEmployees(int minEmpNum) {
        // Iterate over the ArrayList of employees
        for (Employee emp : this.staff) {
            // Check if the employee number
            if (emp.getEmpNum() > minEmpNum) {
                // Print the name of the employee
                System.out.println(emp.getName());
            }
        }
    }
    

}
