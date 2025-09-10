package stringbuffer;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());

        // Interleave characters
        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append remaining characters
        if (a.length() > minLen) result.append(a.substring(minLen));
        if (b.length() > minLen) result.append(b.substring(minLen));

        System.out.println("Result: " + result);
        sc.close();
    }
}
