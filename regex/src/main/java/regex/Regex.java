package main.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String input = "Sample123Password";
        System.out.println("PATTERN MATCH:- " + regex.validPassword(input));
    }

    public boolean validFirstName(String input){
        Pattern pattern = Pattern.compile("%[A-Z][\\w]{2,}$");

        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean validLastName(String input){
        Pattern pattern = Pattern.compile("^[A-Z][\\w]{2,}$");
        
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean validEmail(String input){
        Pattern pattern = Pattern.compile("^[a-z]+([\\.][a-z]+)?@[a-z]+.[a-z]+([\\.][a-z]+)?$");
        
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean validMobile(String input){
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean validPassword(String input){
        Pattern pattern = Pattern.compile("(?=\\w*[A-Z]+\\w*)(?=\\w*[0-9]+\\w*)^\\w{8,}$");

        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
