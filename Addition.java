import java.util.Scanner; // import the Scanner class - which allows us to read input from the console

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object to read input from the console
        int num1; // declare a variable of type int for first number
        int num2; // declare a variable of type int for second number
        int sum; // declare a variable of type int for the sum

        System.out.print("Enter first integer: "); // prompt user for first integer
        num1 = input.nextInt(); // read first integer from user - nextInt() reads an integer from the console -
                                // comes from the Scanner class - it's a function/method
        System.out.print("Enter second integer: "); // prompt user for second integer
        num2 = input.nextInt(); // read second integer from user

        sum = num1 + num2; // add the two numbers and store the result in sum

        System.out.printf("Sum is %d.%n", sum); // print the sum to the console - %d is a placeholder for an integer
                                                // value - %n is a newline character

        input.close(); // close the Scanner object to prevent resource leak - which is when you
                       // have a resource that is not being used and is taking up memory

    }

}