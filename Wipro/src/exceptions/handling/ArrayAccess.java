package exceptions.handling;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements in the array: ");
            int n = Integer.parseInt(sc.nextLine());
            int arr[] = new int[n];
            System.out.print("Enter the elements in the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.next());
            }
            System.out.print("Enter the index of the array element you want to access: ");
            int idx = sc.nextInt();
            System.out.println("The array element at index " + idx + " = " + arr[idx]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        sc.close();
    }
}