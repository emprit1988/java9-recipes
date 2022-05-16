package csmath;

import java.util.LinkedList;
import java.util.List;

import java.util.*;

import static csmath.PrimeImproved.isPrimeCheck;

public class PrimeImproved{
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        List<Integer> primeNums = new LinkedList<>();

        for(int i = low;i<=high;i++){
            if(isPrimeCheck(i)) {
                primeNums.add(i);
            }
        }

        primeNums.stream().forEach(System.out::println);
    }

    public static boolean isPrimeCheck(int number){
        for(int j = 2;j<=Math.sqrt(number);j++){
            if(number%j == 0){
                return false;
            }
        }
        return true;
    }


}