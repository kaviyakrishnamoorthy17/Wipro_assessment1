package wrapperclass;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1-255): ");
        int num = sc.nextInt();
        
        if (num < 1 || num > 255) {
            System.out.println("Number out of range!");
            return;
        }
        
        String binary = Integer.toBinaryString(num);
        String paddedBinary = String.format("%8s", binary).replace(' ', '0');
        
        System.out.println("Binary representation: " + paddedBinary);
    }
}
