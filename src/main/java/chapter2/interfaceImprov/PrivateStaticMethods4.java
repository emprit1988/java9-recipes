package chapter2.interfaceImprov;

/**
 * Private Static methods
 * To share the code across static methods in an interface, use private static methods.
 *
 */

interface MyInterface4{
    static void staticMethod1(){
        staticLogger();
        System.out.println("Hey i'm static 1");
    }

    static void staticMethod2(){
        staticLogger();
        System.out.println("Hey i'm static 2");
    }

    //cannot be non-static
    private static void staticLogger(){
        System.out.println("starting method");
        System.out.println("running method...");
    }

    default void entry(){
        staticMethod1();
        staticMethod2();
    }
}
public class PrivateStaticMethods4 implements MyInterface4 {
    public static void main(String[] args) {
        PrivateStaticMethods4 privateStaticMethods4 = new PrivateStaticMethods4();
        privateStaticMethods4.entry();
    }

}
