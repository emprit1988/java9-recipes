package csmath;

import java.util.Scanner;

public class NumberInverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal = scanner.nextInt();
        int counter = 0;
        int answer = 0;

        while(iVal != 0){
            int rem = iVal % 10;
            answer += ++counter * (int)Math.pow(10,rem-1);
            iVal = iVal / 10;
        }
        System.out.println(answer);
    }
}
