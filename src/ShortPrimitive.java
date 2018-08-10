/**
 * Class to show examples of short primitives
 * @author Udayan Khattry
 */

public class ShortPrimitive {
    public static void main(String [] args) {
        short s1 = -32768;
        byte b1 = 100;
        short s2 = 32767;
        byte b2 = 25;
        short s3 = 500;

        System.out.println("s1 + b1 = " + (s1 + b1)); // -32668
        System.out.println("s2 + b2 = " + (s2 + b2)); // 32792
        System.out.println("s3 = " + s3);

        // example below is an example of value that is beyond the scope of a short primitive. it will say: java: incompatible types: possible lossy conversion from int to short
        // short error = s2 + b2;
        // System.out.println(error);
    }
}
