package chapter4.numericalProblems;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random random = new Random();

        // contains stream options too, do some research later
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(4));

        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());

        System.out.println(random.nextLong());

        System.out.println(Math.random()); // returns a double value between 0.0 and 1.0

    }
}
