package chapter1;

public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean BooleanVal = true;  /* default false */
        char charval = 'G';
        charval = '\u0B85';     /* tamil letter Aa */
        byte byteval;       /*  8 bits  -127 to 127*/
        short shortval;     /* 16 bits -32,768 to 32,768  */
        int intval;         /* 32 bits -2147483648 to 2147483647*/
        long longval;       /* 64 bits -(2^64) to 2^64 - 1*/

        float floatval = 10.123456F; /* 32-bit IEEE 754 */
        double doubleval = 10.12345678987654; /* 64-bit IEEE 754 */
        String message = "Darken the corner where you are!";

        System.out.println(charval);

    }
}
