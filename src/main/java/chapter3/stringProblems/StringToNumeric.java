package chapter3.stringProblems;

public class StringToNumeric {
    public static void main(String[] args) {
        String one = "1";
        String two = "2";

        int result = Integer.valueOf(one); // valueOf returns Integer, autoboxed to int
        int result1 = Integer.valueOf(one) + Integer.valueOf(two);

        System.out.println(result);
        System.out.println(result1);

        int result2 =  Integer.parseInt(one);
        int result3 =  Integer.parseInt(one) + Integer.parseInt(two);

        //difference is parseInt returns int but valueOf returns Integer
        // valueOf returns Integer from cache but parseInt doesn't

        System.out.println(result2);
        System.out.println(result3);

    }
}
