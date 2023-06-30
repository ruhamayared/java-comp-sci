import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object - object reference

        int total = 0; // sum of values entered by user
        int count = 0; // number of values entered
        int number; // value entered by user
        double average; // average of the values

        System.out.print("Enter an integer (-1 to quit): ");
        number = s.nextInt(); // read first integer from user

        while (number != -1) {
            total = total + number; // add number to total
            count = count + 1; // increment count

            System.out.print("Enter an integer (-1 to quit): ");
            number = s.nextInt(); // read next integer from user
        }

        if (count != 0) {
            average = (double) total / count; // avoid integer division - because Java will round down :(
            System.out.printf("The average is %.2f%n", average); // %.2f - format specifier for floating point numbers
                                                                 // with 2 decimal places
        } else {
            System.out.println("No values were entered.");
        }

        s.close(); // close the Scanner object to prevent resource leak
    }

}
