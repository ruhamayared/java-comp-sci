import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // s is the name of the Scanner object that we just created and we are
                                            // telling it to read from the System.in stream (which is the keyboard)

        int score;

        System.out.println("Enter your APCS Test score: ");
        score = s.nextInt();

        System.out.println("Passed: " + checkPassed(score)); // We are calling the checkPassed method and passing it the
                                                             // score variable as an argument
        s.close();
    }

    private static boolean checkPassed(int apScore) { // This method takes in an integer and returns a boolean
        if (apScore > 0 && apScore <= 5) {
            if (apScore == 1 || apScore == 2) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

// Why can I access the checkPassed method from the checkPassed method?
// Because they are both in the same class and static methods can access other
// static methods in the same class
// If not static, then you would have to create an instance of the class to
// access the method