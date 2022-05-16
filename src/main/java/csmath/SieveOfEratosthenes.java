package csmath;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of prime");
        int nVal = sc.nextInt();

        int[] primeVal = new int[nVal+1];
        for(int i=0;i<=nVal;i++) {
            primeVal[i] = 1;
        }

        primeVal[0] = 0; // 0
        primeVal[1] = 0; // 1

        for(int i=2;i<=Math.sqrt(nVal);i++){
            if(primeVal[i] == 1){
                for(int j=2; i*j <= nVal;j++){
                    primeVal[i*j] = 0;
                }
            }
        }

//        IntConsumer intPrinter = i -> System.out.print(i+ " ");
//        Arrays.stream(primeVal).filter(e -> e!=0).forEach(intPrinter);

        for(int i=0;i< primeVal.length;i++){
            if(primeVal[i] != 0){
                System.out.println(i);
            }
        }

    }
}