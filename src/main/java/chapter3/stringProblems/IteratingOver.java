package chapter3.stringProblems;

public class IteratingOver {
    public static void main(String[] args) {
        String str = "Break down into chars";
        System.out.println(str);
        for(char c : str.toCharArray()){
            System.out.println(c);
        }

        for(int x=0;x<str.length();x++){
            System.out.print(str.charAt(x));
        }

    }
}
