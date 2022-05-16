package chapter1;

import java.util.Map;

public class EnvironmentTest {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(String arg : args){
            System.out.println(arg);
        }

        Map<String,String> vars = System.getenv();
        for(String var : vars.keySet()){
            System.out.print(var);
            System.out.println(" : " + vars.get(var));
        }
    }
}
