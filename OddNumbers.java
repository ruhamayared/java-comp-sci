import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the first integer: ");
        num1 = s.nextInt();

        System.out.print("Enter the second integer (greater than the first): ");
        num2 = s.nextInt();

        while (num2 <= num1) {
            System.out.print("Enter the second integer (greater than the first): ");
            num2 = s.nextInt();
        }

        // This for loop prints all the odd numbers between num1 and num2 by
        // incrementing from num1 to num2 and checking if each number is odd then
        // printing it
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        s.close();
    }

}
// public keyword - means that the class is accessible by any other class
// class keyword - means that we are creating a class
// private keyword - means that the variable or method can only be accessed within the class
// static keyword - means that the variable or method belongs to the class and not an instance of the class