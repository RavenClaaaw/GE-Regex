package main.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String input = "roop";
        try {
            System.out.println("PATTERN MATCH:- " + regex.validFirstName(input));
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public boolean validFirstName(String input){
        Pattern pattern = Pattern.compile("^[A-Z][\\w]{2,}$");

        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.matches();
        if(match) return true;
        else throw new IllegalArgumentException("Invalid First Name");
    }

    public boolean validLastName(String input){
        Pattern pattern = Pattern.compile("^[A-Z][\\w]{2,}$");
        
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.matches();
        if(match) return true;
        else throw new IllegalArgumentException("Invalid Last Name");
    }

    public boolean validEmail(String input){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$");
        
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.matches();
        if(match) return true;
        else throw new IllegalArgumentException("Invalid Email");
    }

    public boolean validMobile(String input){
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.matches();
        if(match) return true;
        else throw new IllegalArgumentException("Invalid Mobile");
    }

    public boolean validPassword(String input){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*()_=])(?!.*[@#$%^&*()_=]{2,})(?!.*[@#$%^&*()_=].*[@#$%^&*()_=])[A-Za-z0-9@#$%^&*()_=]{8,}$");
        // (?=.*[0-9])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}
        Matcher matcher = pattern.matcher(input);
        boolean match = matcher.matches();
        if(match) return true;
        else throw new IllegalArgumentException("Invalid Password");
    }
}