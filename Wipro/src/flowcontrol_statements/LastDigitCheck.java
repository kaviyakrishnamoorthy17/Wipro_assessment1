package flowcontrol_statements;

import java.util.Scanner;

public class LastDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read two non-negative integers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Extract last digits
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        // Check if last digits are same using if statement
        if (lastDigit1 == lastDigit2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
