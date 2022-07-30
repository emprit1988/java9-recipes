package challenger;

/**
 *  setting null to an object simply clears the reference
 *  obj -------> +------+
 *               |OBJECT|
 *  temp ------> +------+
 *
 *  after setting null
 *  obj          +------+
 *               |OBJECT|
 *  temp ------> +------+
 */

public class SimpleReference {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object temp = obj1;

        System.out.println(obj1);
        System.out.println(temp);

        obj1 = null;

        System.out.println(obj1);
        System.out.println(temp);
    }
}
