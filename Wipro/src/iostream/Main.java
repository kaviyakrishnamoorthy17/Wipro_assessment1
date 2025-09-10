package iostream;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the file name");
            String fileName = sc.nextLine();

            System.out.println("Enter the character to be counted");
            char ch = sc.nextLine().charAt(0);
            char chLower = Character.toLowerCase(ch);

            FileReader fr = new FileReader(fileName);
            int count = 0, data;

            while ((data = fr.read()) != -1) {
                char c = Character.toLowerCase((char) data);
                if (c == chLower) {
                    count++;
                }
            }
            fr.close();

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + ch + "'.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
