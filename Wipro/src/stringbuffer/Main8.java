package stringbuffer;

import java.util.Scanner;

public class Main8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with '*': ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue; // skip '*'
            if (i > 0 && str.charAt(i - 1) == '*') continue; // skip left neighbor
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue; // skip right neighbor
            result.append(str.charAt(i));
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
