package stringbuffer;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0 || n > str.length()) {
            System.out.println("Invalid n");
        } else {
            String lastN = str.substring(str.length() - n);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(lastN);
            }
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
