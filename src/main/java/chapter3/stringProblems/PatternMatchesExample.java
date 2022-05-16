package chapter3.stringProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchesExample {
    public static void main(String[] args) {
        String input = "I love java 8! It is my favorite programming language. Java 8 is the 8th version of this great programming language";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches()); // until it matches the full string this will be false
        System.out.println(matcher.find());
        System.out.println(matcher.replaceAll("11"));
    }
}
