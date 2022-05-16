package csmath;

public class BreakDownNumbers {
    public static void main(String[] args) {
        int inp = 345;
        int temp = inp;
        int digCnt = 0;
        while(inp != 0){
            int rem = inp % 10;
            inp = inp /10;
            digCnt++;
        }

        int div = (int)Math.pow(10,digCnt-1); // digCnt=3 10^3-1 = 100
        while(div != 0){
            System.out.println(temp/div);
            temp = temp % div;
            div = div / 10;
        }
    }
}
