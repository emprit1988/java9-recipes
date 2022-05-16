package chapter3.stringProblems;

import java.util.Locale;

public class ChangeCase {
    public static void main(String[] args) {
        String alpha = "alpha";
        String beta = "bêta";

        System.out.println(alpha.toUpperCase());
        System.out.println(alpha.toUpperCase(Locale.ROOT));
        System.out.println(alpha.toUpperCase(Locale.FRANCE));
        System.out.println(beta.toUpperCase(Locale.FRANCE)) ;

        System.out.println(beta.equalsIgnoreCase(beta.toUpperCase(Locale.FRANCE)));
    }
}
