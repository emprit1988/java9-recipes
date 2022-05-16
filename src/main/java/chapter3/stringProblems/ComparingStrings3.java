package chapter3.stringProblems;

public class ComparingStrings3 {
    public static void main(String[] args) {
        String a1 = "test";
        String a2 = "best";

        String b1 = "Test";
        String b2 = "best";

        String sp1 = "T";
        String sp2 = "est";

        System.out.println(a1.compareTo(b1));
        System.out.println(a1.compareToIgnoreCase(b1));

        System.out.println(a2.compareTo(b2));
        System.out.println(a2.compareToIgnoreCase(b2));

        System.out.println(a1.compareTo(sp1+sp2));
        System.out.println(a1.compareToIgnoreCase(sp1+sp2));
    }
}
