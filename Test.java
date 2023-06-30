public class Test {
    public static void main(String[] args) {
        int x = 7;
        int y = 7;

        if (x == 5) {
            System.out.println("x is equal to 5.");
        } else if (x == 6) {
            System.out.println("x is equal to 6.");
        } else {
            System.out.println("x is not equal to 5 or 6.");

        }

        // Nested if statements
        if (x == y) {
            System.out.println("x is equal to " + y + ".");
            if (x % 2 == 0) {
                System.out.println("x is even.");
            } else {
                System.out.println("x is odd.");
            }
        }
    }

}
