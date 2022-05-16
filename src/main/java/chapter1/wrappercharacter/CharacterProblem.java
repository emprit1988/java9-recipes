package chapter1.wrappercharacter;
/*
 input : a3tx2z
 output : attttxzzz
 */

public class CharacterProblem {
    public static void main(String[] args) {
        String input = "a3tx2z";
        StringBuilder sb = new StringBuilder();
        char [] inputArr = input.toCharArray();
        int repeat = 0;
        for(char ch : inputArr){
            if(Character.isDigit(ch)){
                repeat = repeat * 10 + Character.getNumericValue(ch);
            }else{
                while(repeat > 0){
                    sb.append(ch);
                    repeat--;
                }
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
