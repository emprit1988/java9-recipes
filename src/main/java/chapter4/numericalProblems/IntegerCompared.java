package chapter4.numericalProblems;

public class IntegerCompared {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        //returns boolean result
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < z);
        System.out.println(x >= y);
        System.out.println(y <= z);

        System.out.println(Integer.compare(x,y)); // first number lesser than second returns -1
        System.out.println(Integer.compare(z,y)); // first number greater than second returns 1
        System.out.println(Integer.compare(x,x)); // both numbers equal returns 0

        Integer intSome = 5;
        System.out.println(intSome.compareTo(4));


    }
}
