package chapter3.stringProblems;

public class MatchesExample {
    public static void main(String[] args) {
        String str = "Here is a long... string. Let's find a match!";
        boolean result = str.matches("Here is a long");
        boolean result2 = str.matches("Here is a long... string. Let's find a match!");
        System.out.println(result);
        System.out.println(result2); //returns true only when entire string matches

        String input = "true";
        System.out.println(input.matches("[Tt]rue"));

        String input2 = "I love Java 9!";
        System.out.println(input2.matches("I love Java [0-9]!"));

        String input3 = "I love Java 11!";
        System.out.println(input3.matches("I love Java [0-9]!"));

        //cant understand // need to learn regex
        String input4 = "I love nodejs 8.5.6!";
        System.out.println(input2.matches("I love .*[ 0-9]!"));




    }
}
