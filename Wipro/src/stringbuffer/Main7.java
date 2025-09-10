package stringbuffer;

import java.util.Scanner;

public class Main7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove 'x' at the start
        if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        // Remove 'x' at the end
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println("Result: " + str);
        sc.close();
    }
}
