package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class SquareFilter {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 9, 16, 20, 25, 36, 50));
        Predicate<Integer> perfectSquare = n -> Math.sqrt(n) == (int)Math.sqrt(n);

        System.out.println("Perfect squares:");
        for (int n : nums) {
            if (perfectSquare.test(n)) {
                System.out.println(n);
            }
        }
    }
}
