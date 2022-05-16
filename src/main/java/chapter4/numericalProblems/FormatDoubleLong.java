package chapter4.numericalProblems;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatDoubleLong {

    public static void formatDouble(double myDouble){
        NumberFormat numberFormat = new DecimalFormat("##.000");
        // NumberFormat accepts DecimalFormat object because NF is abstract class
        // DF contains NF methods and few more implementations
        String result = numberFormat.format(myDouble);
        System.out.println(result);

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        // factory method uses current locale
        System.out.println(numberFormat1.format(34.56));

        NumberFormat numberFormat2 =  NumberFormat.getInstance(Locale.GERMAN);
        System.out.println(numberFormat2.format(233.44232));
        System.out.println(numberFormat2.format(-393.232));
    }

    public static void main(String[] args) {
        formatDouble(9.0);
        formatDouble(-9.0);
    }
}
