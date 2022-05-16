package chapter2.interfaceImprov;

/**
 * default methods are introduced in java8
 *
 * lets say if we want to introduce an abstract method in an interface in an legacy application
 * if 10 classes extend this interface, it would require you to modify all the 10 classes
 * in-case of default method it becomes unnecessary. retains the compatibility of your api.
 *
 * Multiple inheritance problem
 * if two or more interface contains same signature method, the class that implements method, will
 * not be able to invoke the correct method. To overcome that override in the implemented class.
 */
interface MyInterface{

    default void newMethod(){
        System.out.println("Hey ! i'm default method!!");
    }

    void someAbstractMethod();
}

public class DefaultMethods1 implements MyInterface{
    public void someAbstractMethod(){
        System.out.println("Implemented abstract method!");
    }

    public void newMethod(){
        System.out.println("Hey ! I'm not your default");
    }

    public static void main(String[] args) {
        DefaultMethods1 defaultMethods1 = new DefaultMethods1();
        defaultMethods1.someAbstractMethod();
        defaultMethods1.newMethod();
    }
}
