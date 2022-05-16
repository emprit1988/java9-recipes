package chapter1.wrapperNumeric;

public class ByteTest {
    public static void main(String[] args) {
        Byte b1 = 123;
        Byte b2 = Byte.valueOf("23");
        Byte b3 = Byte.parseByte("43");
        // Byte b4 = Byte.parseByte("3000"); //cannot exceed max value

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
