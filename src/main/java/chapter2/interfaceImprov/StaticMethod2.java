package chapter2.interfaceImprov;

/**
 * static methods inside interface behaves similar to default methods
 * except, it cannot be over-ridden
 * note: its not instance method.
 */
interface MyInterface2{
    static void staticMethod(){
        System.out.println("Hey! I'm static method inside interface");
    }
}
public class StaticMethod2 implements MyInterface2{
    public static void main(String[] args) {
        MyInterface2.staticMethod();
    }
}
