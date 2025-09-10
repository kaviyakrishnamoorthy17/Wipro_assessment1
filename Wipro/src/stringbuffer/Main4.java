package stringbuffer;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result;
        if (str.length() % 2 == 0) {
            result = str.substring(0, str.length() / 2);
        } else {
            result = null;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
