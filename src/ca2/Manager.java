/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

/**
 *
 * @author Justin
 */

class Manager extends Employee {
    // Constructor
    private String username;
    private String password;
    
    // Constructor for a new Manager
    public Manager(String name, String email, String username, String password) {
        super(name, email);
        this.username = username;
        this.password = password;
    }
    
    // Promote an existing Employee to a Manager
    public Manager(Employee emp, String username, String password) {
        super(emp.getName(), emp.getEmail());
        this.username = username;
        this.password = password;
    }
    
    // Getters
    public String getUsername() {
        return this.username;
    }
    
    private String getPassword() {
        return this.password;
    }
    
    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
