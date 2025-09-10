package array_programs;

import java.util.Arrays;  // ✅ Add this line

public class TwoLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 6};
        Arrays.sort(arr);  // Sorts the array

        System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
    }
}
