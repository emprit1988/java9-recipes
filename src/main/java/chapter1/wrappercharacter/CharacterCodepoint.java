package chapter1.wrappercharacter;

public class CharacterCodepoint {
    public static void main(String[] args) {
        String greet = "hello world";
        System.out.println(greet.codePointAt(0)); //Ascii value of h 104
        int asciiVal = greet.codePointAt(0);
        asciiVal = asciiVal+1;
        System.out.println(asciiVal); //105

        char asciiChar = (char) asciiVal;
        System.out.println(asciiChar); //i

        //to string
        String asciiStr = "" + (char)asciiVal;
        System.out.println(asciiStr);

        //char to int - int to char
        char singleChar = 'h';
        int singleval = (int) singleChar;
        System.out.println(singleval);

        char resultChar = (char) singleval;
        System.out.println(resultChar);
    }
}
