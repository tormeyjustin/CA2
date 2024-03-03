/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Justin
 */

public class EmailValidator {
    // Regex pattern for email validation
    private static String emailRegex = "(.+)@(.+)\\.(.+)";
    
    public boolean isValid (String email) {
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
}
