import java.util.Scanner;

public class Comparer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object to read input from the console

        int num1; // declare a variable of type int for first number
        int num2; // declare a variable of type int for second number

        System.out.print("Enter first integer: "); // prompt user for first integer
        num1 = input.nextInt(); // read first integer from user

        System.out.print("Enter second integer: "); // prompt user for second integer
        num2 = input.nextInt(); // read second integer from user

        System.out.printf("%d is larger than %d.%n", Math.max(num1, num2), Math.min(num1, num2)); // print the larger
                                                                                                  // number to the
                                                                                                  // console -
        // Math.max() is a method that returns the larger of the two numbers
        // Math.min() is a method that returns the smaller of the two numbers

        System.out.println("The first number greater than the second number: " + (num1 > num2)); // print true or false

        input.close();

    }

}
