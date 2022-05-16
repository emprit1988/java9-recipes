package chapter3.stringProblems;

public class ComparingStrings {
    public static void main(String[] args) {
        String one = "one";
        String two = "two";

        String var1 = "one";
        String var2 = "two";

        String piece1 = "t";
        String piece2 = "wo";

        if(one.equals(var1)){
            System.out.println("its equal");
        }

        if(one == var1){
            System.out.println("its not equal");
        }

        if(var2.equals(piece1+piece2)){
            System.out.println("its equal too!");
        }
    }
}
