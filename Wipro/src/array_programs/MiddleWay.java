package array_programs;
import java.util.Arrays;

public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = {a[1], b[1]};

        System.out.println("Middle elements: " + Arrays.toString(result));
    }
}
