package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Function;

public class SumOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 3, 9, 1, 8, 11, 5, 7));
        Function<ArrayList<Integer>, Integer> sumFunc = list -> {
            int sum = 0;
            for (int n : list) sum += n;
            return sum;
        };
        System.out.println("Sum: " + sumFunc.apply(nums));
    }
}
