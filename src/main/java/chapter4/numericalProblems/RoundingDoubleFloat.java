package chapter4.numericalProblems;

public class RoundingDoubleFloat {
    public static int roundFloatToInt(float myFloat){
        return Math.round(myFloat);
    }

    public static long roundDoubleToLong(double myDouble){
        return Math.round(myDouble);
    }

    /**
     * if a NaN value is passed, it returns zero eg: 0.0f / 0.0f
     * if a positive infinity or negative infinity is passed it returns <Datatype>.MAX_VALUE or
     * <Datatype>.MIN_VALUE
     * To create infinity value 1.0/0.0
     * To create negative infinity value -1.0/0.0
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(roundFloatToInt(4.932f));
        System.out.println(roundFloatToInt(-4.932f));
        System.out.println(roundFloatToInt(0.0f/0.0f));
        System.out.println(roundFloatToInt(1.0f/0.0f));
        System.out.println(roundFloatToInt(-1.0f/0.0f));

        System.out.println(roundDoubleToLong(4.932));
        System.out.println(roundDoubleToLong(-4.932));
        System.out.println(roundDoubleToLong(0.0/0.0));
        System.out.println(roundDoubleToLong(1.0/0.0));
        System.out.println(roundDoubleToLong(-1.0/0.0));
    }
}
