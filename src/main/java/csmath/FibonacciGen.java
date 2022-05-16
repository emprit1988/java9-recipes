package csmath;

import java.util.Scanner;

public class FibonacciGen {

    private static long [] fibCache; // memoized long variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nVal =  scanner.nextInt();
        fibCache = new long[nVal+1];
        System.out.println(findFib(nVal));
    }

    private static long findFib(int nVal) {
        //System.out.println("Inn for nVal"+nVal);
        if(nVal <= 1){
            return nVal;
        }
        if(fibCache[nVal] != 0){
            return fibCache[nVal];
        }
        long fibVal = findFib(nVal -1) + findFib(nVal - 2);
        //System.out.println("storing for nVal"+nVal);
        fibCache[nVal] = fibVal;
        return fibVal;
    }
}
