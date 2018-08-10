/**
 * Class to show examples of long primitives
 * @author Udayan Khattry
 */

public class LongPrimitive {
    public static void main(String[] args) {
        long l1 = 5000L; // suffix L is optional, literal 5000 is of int type and long type can be accommodate int range without any issues
        System.out.println("l1 = " + l1);

        long l2 = -5000; // suffix L is optional
        System.out.println("l2 = " + l2);

        //long l3 = -21474836491;
        // suffix L is  compulsory, this number is out of the int range. will throw an error saying: java: integer number too large
        // System.out.println("l3 = " + l3);

        long l4 = 2147483648L; // suffix L is compulsory, this number is out of range for int range
        System.out.println("l4 = " + l4);

        long creditCardNumber = 5876_1234_3452_9832L; // suffix L is compulsory, but you can have underscores to improve the readability. above statement is same as long credCardNumber = 5876123434529832

        System.out.println("creditCardNumber = " + creditCardNumber);
    }
}
