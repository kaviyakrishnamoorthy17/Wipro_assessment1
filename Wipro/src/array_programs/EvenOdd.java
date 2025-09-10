package array_programs;
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int index = 0;

        // First add even numbers
        for (int num : arr) {
            if (num % 2 == 0) result[index++] = num;
        }
        // Then add odd numbers
        for (int num : arr) {
            if (num % 2 != 0) result[index++] = num;
        }

        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
