package chapter1.wrapperboolean;

public class BooleanTest {
    public static void main(String[] args) {
        Boolean status = true;
        Boolean flag = false;
        Boolean status2 = true;

        System.out.println(status);
        System.out.println(status.booleanValue());
        System.out.println(status.toString());
        System.out.println(status.equals(flag));
        System.out.println(status.equals(Boolean.valueOf("true"))); //string to boolean

        System.out.println(status.hashCode());
        System.out.println(status2.hashCode());

    }
}
