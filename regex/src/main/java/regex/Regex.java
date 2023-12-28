package main.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][\\w]{2,}");
        
        String input = "RoOp";
        Matcher matcher = pattern.matcher(input);
        System.out.println("PATTERN MATCH:- " + matcher.matches());
    }
}
