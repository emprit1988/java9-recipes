package csmath;

import java.util.LinkedList;
import java.util.List;

public class PrimeBasic {

    public static void main(String[] args) {
        List<Integer> primeNumbers = primeNumbersBruteForce(8);
        primeNumbers.stream().forEach(System.out::println);
    }

    private static List<Integer> primeNumbersBruteForce(int n) {
        List<Integer> primeNumbers = new LinkedList<>();
        for(int i=2;i<=n;i++){
            if(primeOptimised(i)){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrimeBruteForce(int number) {
        for(int i=2;i < number;i++){
            System.out.println(number +" % "+i);
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean primeOptimised(int number){
        //System.out.println(number + " - " + (int)Math.sqrt(number));
        for(int i=2;i<= Math.sqrt(number);i++){
            System.out.println(number +" % "+i);
            if(number % i == 0){
                //System.out.println(" false for "+number);
                return false;
            }
        }
        return true;
    }
}
