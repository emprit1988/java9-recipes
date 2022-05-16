package chapter1.wrapperNumeric;

public class LongTest {
    public static void main(String[] args) {
        Long l1 = 992929L;
        Long l2 = 3933838l; //case insensitive

        Long l3 = Long.valueOf("382828");
        //Long l4 = Long.valueOf("92929L"); //cannot accept string L
        Long l4 = Long.parseLong("34422"); //another way to parses

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println(l3.byteValue());
        System.out.println(l3.shortValue());
        System.out.println(l3.floatValue());
        System.out.println(l3.doubleValue());
        System.out.println(l3.toString());


    }
}
