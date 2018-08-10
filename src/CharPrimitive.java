/**
 * Class to show char primitives
 * @author Udayan Khattry
 */
public class CharPrimitive {
    public static void main(String[] args) {
        char c1 = 65;
        char c2 = 'A';
        char c3 = '\u0041'; // unicode value corresponding to character 'A'
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        char c4 = 8377; // Decimal code for indian rupee symbol
        char c5 = '\u20B9'; // Unicode value for indian rupee symbol
        char c6 = 65535; // no error
        // char c7 = 65536; compilation error - outside range

        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
