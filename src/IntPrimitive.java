/**
 * Class to show examples of int primitives
 */
public class IntPrimitive {
    public static void main(String[] args) {

        int i1 = -2147483648;
        System.out.println(i1);

        i1 = 2147483647;
        System.out.println(i1);

        i1 = 100_000;
        System.out.println(i1);

        // i1 = -2147483649; Out of range
        // i1 = 2147483648; Out of range 
    }
}
