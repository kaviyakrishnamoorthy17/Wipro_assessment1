package stringbuffer;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if last char of str1 equals first char of str2
        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // Remove first char of str2 to avoid double char
            str2 = str2.substring(1);
        }

        // Concatenate strings
        String result = str1 + str2;

        System.out.println("Result: " + result);
        sc.close();
    }
}
