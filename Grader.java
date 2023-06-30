import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object to read input from the console

        int score; // declare a variable of type int for the score

        System.out.print("Enter score: "); // prompt user for score
        score = input.nextInt(); // read score from user and assign to score variable

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        input.close();

    }

}
