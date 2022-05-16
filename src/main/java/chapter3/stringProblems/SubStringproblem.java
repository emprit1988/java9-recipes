package chapter3.stringProblems;

public class SubStringproblem {
    public static void main(String[] args) {
        //use substring to obtain a portion of a string
        String source = "This is original string";
        System.out.println(source.substring(0,source.length()));
        System.out.println(source.substring(5,10));
        System.out.println(source.substring(5));
    }
}
