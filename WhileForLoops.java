public class WhileForLoops {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            for (int j = 4; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            System.out.println(); // Nothing is printed to the console, but the cursor
            // moves to the next line
        }

        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++; // an update for the counter variable so it doesn't run forever
        }

    }

}