package javafundamentals.languagebasics;

public class Add_Two {
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length < 2) {
            System.out.println("Please provide two integers as arguments.");
            return;
        }

        // Convert string arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        // Print result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
