package chapter1;

public class WrapperClass {
    // Wrapper classes store reference to the object containing values
    public static void main(String[] args) {
        //character
        Character character = new Character('h'); // deprecated
        Character character1 = Character.valueOf('e');
        Character [] wrapCh = {'a','b'};
        System.out.println(character1);

        Byte biteM = new Byte("3"); //deprecated
        Byte biteN = Byte.valueOf("1");
        System.out.println(biteN);

        Short shortY = new Short("30000"); //deprecated
        Short shortX = Short.valueOf("3030");
        System.out.println(shortX);

        Double doubleV = new Double("0.0"); //deprecated
        Double doubleM = Double.valueOf("0.1");
        System.out.println(doubleM);

        Integer integerV = new Integer("4"); //deprecated
        Integer integerM = Integer.valueOf("2");
        System.out.println(integerM);

        Float floatX = new Float("3.0");//deprecated
        Float floatY = Float.valueOf("3.6");
        System.out.println(floatY);

        Long longX = new Long("22"); // deprecated
        Long longY = Long.valueOf("23");
        System.out.println(longY);

        Boolean boolX = new Boolean("true"); //deprecated
        Boolean boolY = Boolean.TRUE;
        Boolean boolZ = Boolean.valueOf("false");

    }
}
