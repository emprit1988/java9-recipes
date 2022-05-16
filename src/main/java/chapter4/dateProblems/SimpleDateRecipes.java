package chapter4.dateProblems;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

public class SimpleDateRecipes {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //obtain date from year,month and date
        LocalDate createdDate = LocalDate.of(2000, Month.DECEMBER,30);
        System.out.println(createdDate);

        //obtain year month
        YearMonth currentYearMonth = YearMonth.now();
        System.out.println(currentYearMonth);

        YearMonth createdYearMonth = YearMonth.of(2010,Month.JULY);
        System.out.println(createdYearMonth);

        //obtain month day
        MonthDay currentMonthDay = MonthDay.now();
        System.out.println(currentMonthDay);

        MonthDay createdMonthDay = MonthDay.of(Month.JULY,26);
        System.out.println(createdMonthDay);

    }
}
