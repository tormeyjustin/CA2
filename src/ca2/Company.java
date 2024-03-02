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
    private void addNewStaff(Employee employee) {
        this.staff.add(employee);     
    }
    
    // Get the number of employees
    public int getStaffNumber() {
        return this.staff.size();
    }
    
    public void listEmployees(int minEmpNum) {
        // Iterator
        Iterator<Employee> iterator = this.staff.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if(emp.getEmpNum() > minEmpNum) {
                System.out.println(emp.getName());
            }
        }
        
    }
}
