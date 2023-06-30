public class MathTest {
    public static void main(String[] args) {
        // Integer(int value) has been deprecated
        // Integer i = new Integer(2);

        // Use valueOf instead
        Integer i = Integer.valueOf(2); // Wrapper class - it wraps the primitive type int and gives it some extra
                                        // functionality
        int b = i.intValue(); // Unwrapping the Integer object to get the primitive type int

        System.out.println(i);
        System.out.println(b);

        // compareTo
        System.out.println(i.compareTo(b));

        double x = Math.pow(2, 3);
        System.out.println(x);

    }
}
