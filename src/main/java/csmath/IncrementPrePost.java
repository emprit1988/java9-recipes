package csmath;

public class IncrementPrePost {
    public static void main(String[] args) {

        // pre-increment increment applied first and value is used

        // post-increment value used first then increment is applied

        int n = 7;
        System.out.println(++n);

        int p = 9;
        System.out.println(p++);

        int i = 10;
        if(i++ == i){ // 10 == 11
            System.out.println(i + " is good");
        }else {
            System.out.println(i + " is bad");
        }

        int j = 20;
        if(++j == j){ // 21 == 21
            System.out.println(j + " is good");
        } else {
            System.out.println(j + " is bad");
        }


        int k = 10;
        for( ;k <= 10; ){
            System.out.println(k);
            k++;
        }


        int m = 1;
        while(m <= 10)
        {
            System.out.println(m);
            m++;
        }


    }
}
