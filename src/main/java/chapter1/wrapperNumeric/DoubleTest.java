package chapter1.wrapperNumeric;

public class DoubleTest {
    public static void main(String[] args) {
        Double di = 3.234;
        Double di2 = Double.valueOf("4.55");
        //double start
        System.out.println(di2);
        System.out.println(di2.toString());
        System.out.println(di2.intValue());
        System.out.println(di2.floatValue());
        System.out.println(di2.byteValue());

        System.out.println(di2.longValue());
        System.out.println(di2.shortValue());
        System.out.println(di2.equals(di));
        Double parsed1 = Double.parseDouble("4.49");
        System.out.println(parsed1);
        // parsed1 = Double.parseDouble("xxx"); // NumberFormatException
        // Double parsed2 = Double.parseDouble(null); //NullPointerException
        //double end

    }
}
