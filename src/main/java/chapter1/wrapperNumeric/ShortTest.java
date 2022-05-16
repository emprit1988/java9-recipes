package chapter1.wrapperNumeric;

public class ShortTest {
    public static void main(String[] args) {
        Short s1 = 23;
        Short s2 = Short.valueOf("2344");
        Short s3 = Short.parseShort("4556");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
