package stringbuffer;

import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result;
        if (str.length() > 2) {  // Ensure string has at least 3 chars
            result = str.substring(1, str.length() - 1);
        } else {
            result = ""; // Return empty string if length is 2 or less
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

