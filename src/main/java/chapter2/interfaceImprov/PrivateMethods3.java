package chapter2.interfaceImprov;

/**
 * Private method inside interface
 * To share the common code across default method, use private methods
 */
interface MyInterface3{
    default void method1(){
        printLines();
        System.out.println("I'm default method1");
    }

    default void method2(){
        printLines();
        System.out.println("I'm default method2");
    }

    private void printLines(){
        System.out.println("Starting method...");
        System.out.println("Doing method...");
    }
}

public class PrivateMethods3 implements MyInterface3{
    public static void main(String[] args) {
        PrivateMethods3 privateMethods3 = new PrivateMethods3();
        privateMethods3.method1();
        privateMethods3.method2();
    }
}
