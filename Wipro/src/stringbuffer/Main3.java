package stringbuffer;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();
        String firstTwo = str.length() < 2 ? str : str.substring(0, 2);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwo.toLowerCase()); // lowercase if needed
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
