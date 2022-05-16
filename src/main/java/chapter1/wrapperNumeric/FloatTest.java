package chapter1.wrapperNumeric;

public class FloatTest {
    public static void main(String[] args) {
        Float fl = 22F; //f case insensitive
        Float fl2 = Float.valueOf("34.5");
        Float fl3 = Float.valueOf("345.22F");
        // Float fl4 = Float.valueOf("xxdfd"); //Number format exception


        //start of float
        System.out.println(fl);
        System.out.println(fl2);
        System.out.println(fl3);

        System.out.println(fl3.byteValue());
        System.out.println(fl3.floatValue());
        System.out.println(fl3.doubleValue());
        System.out.println(fl3.intValue());
        System.out.println(fl3.longValue());
        System.out.println(fl3.shortValue());

        System.out.println(fl3.toString());
        //end of float

    }
}
