package chapter4.numericalProblems;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MonetaryCalculation {

    public static String formatDollars(double value){
        NumberFormat dollarFormat =  NumberFormat.getCurrencyInstance(Locale.US);
        return dollarFormat.format(value);
    }

    public static String formatInr(double value){
        Locale IND = new Locale("en","IN");
        NumberFormat inrFormat = NumberFormat.getCurrencyInstance(IND);
        return inrFormat.format(value);
    }

    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("32.3233");
        BigDecimal value2 =  BigDecimal.valueOf(232.32); //double param
        BigDecimal value3 =  BigDecimal.valueOf(53l); //long param

        BigDecimal result =  value1.add(value2).add(value3);
        System.out.println(formatDollars(result.doubleValue()));
        System.out.println(formatInr(result.doubleValue()));

    }
}
