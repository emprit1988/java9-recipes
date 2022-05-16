package chapter1.wrapperNumeric;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 123;
        Integer i2 = Integer.valueOf("323");
        Integer i3 = Integer.parseInt("3838");

        System.out.println(i3.byteValue());
        System.out.println(i3.doubleValue());
        System.out.println(i3.floatValue());
        System.out.println(i3.longValue());
        System.out.println(i3.intValue());
        System.out.println(i3.shortValue());

    }
}
