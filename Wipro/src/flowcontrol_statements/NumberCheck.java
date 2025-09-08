package flowcontrol_statements;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is Positive, Negative, or Zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
