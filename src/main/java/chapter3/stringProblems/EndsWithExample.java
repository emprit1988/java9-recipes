package chapter3.stringProblems;

import java.util.Arrays;

public class EndsWithExample {
    public static void main(String[] args) {
        String [] files = {"abc.pdf","free-form.pdf","restro.txt"};
        System.out.println(Arrays.toString(files));
        Arrays.stream(files).filter(e -> e.endsWith("pdf")).forEach(e -> System.out.println(e));
    }
}
