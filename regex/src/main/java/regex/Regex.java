package main.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String input = "Lala";
        System.out.println("PATTERN MATCH:- " + regex.validLastName(input));
    }

    public boolean validFirstName(String input){
        Pattern pattern = Pattern.compile("[A-Z][\\w]{2,}");

        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean validLastName(String input){
        Pattern pattern = Pattern.compile("[A-Z][\\w]{2,}");
        
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
