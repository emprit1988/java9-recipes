package chapter1.wrappercharacter;

import java.util.Arrays;

public class CharacterToStr {
    public static void main(String[] args) {
        //String to char array
        String temp = "hello world";
        char [] primCh = temp.toCharArray();

        //char array to string
        String result = String.valueOf(primCh);
        System.out.println(result);


        //String to character array
        Character [] charArray = temp.chars()
                                    .mapToObj(c ->(char)c)
                                    .toArray(Character[]::new);
        System.out.println(charArray);


        String result2 = Arrays.toString(charArray);
        System.out.println(result2);

    }
}
