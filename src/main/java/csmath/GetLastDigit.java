package csmath;

public class GetLastDigit {
    public static void main(String[] args) {
        int n = 1145;
        int nOfDigits = 0;
        while(n>0){
            int rem = n % 10;
            n = n /10;
            nOfDigits++;
        }
        System.out.println(nOfDigits);
    }
}
