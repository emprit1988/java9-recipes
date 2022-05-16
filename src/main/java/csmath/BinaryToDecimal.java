package csmath;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a valid binary number :");
        int number = scanner.nextInt();
        int base = 2;
        scanner.close();
        int d = toDecimal(number,base);
        System.out.println(d);
    }

    public static int toDecimal(int number,int base){
        int multiplier = 0, ans_num = 0;
        while(number > 0){
            int remainder = number % 10;
            number = number / 10;
            ans_num += remainder * Math.pow(base,multiplier);
            multiplier++;
        }
        return ans_num;
    }
}
