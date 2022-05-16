package chapter3.stringProblems;

public class ComparingStrings2 {
    public static void main(String[] args) {
        String a1 = "test";
        String a2 = "best";

        String b1 = "Test";
        String b2 = "best";

        String sp1 = "T";
        String sp2 = "est";

        System.out.println(a1.equalsIgnoreCase(b1));
        System.out.println(a2.equalsIgnoreCase(b2));

        System.out.println(a1.equalsIgnoreCase(sp1+sp2));
        System.out.println(a1 == sp1+sp2);
    }
}
