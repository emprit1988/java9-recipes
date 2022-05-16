package chapter3.stringProblems;

public class DynamicInfo {
    public static void main(String[] args) {
        double temperature =  90.3930;
        System.out.println(String.format("The current temperature is %.1f degrees Farenheit",temperature));
        System.out.printf("The current temperature is %.2f degrees Farenheit",temperature);
    }
}
