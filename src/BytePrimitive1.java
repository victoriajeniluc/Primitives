/**
 * Class to show examples of positive byte primitives
 */

public class BytePrimitive1 {
    public static void main(String [] args) {
        byte b1 = 25; // Decimal
        byte b2 = 0b11001; // Binary
        byte b3 = 0x19; // Hexadecimal
        byte b4 = 031; // Octal


        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

//        byte b5 = -129; // will not compile due to the out of range

//        byte b6 = 128; // will not compile due to the out of range
//        // b5&b6 will say an error: possible lossy conversion from int to byte
//        System.out.println("b5 = " + b5);
//        System.out.println("b6 = " + b6);

    }
}
