package chapter4.numericalProblems;

public class FloatCompared {
    public static void main(String[] args) {
        Float first = Float.valueOf("39.3930");
        Float second = Float.valueOf("23.433");

        System.out.println(first.compareTo(second));
        System.out.println(second.compareTo(first));
        System.out.println(second.compareTo(second));

        System.out.println(Float.compare(first,second));
        System.out.println(Float.compare(second,first));
        System.out.println(Float.compare(second,second));

    }
}
