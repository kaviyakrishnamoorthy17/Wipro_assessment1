package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class OddEvenConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Consumer<Integer> printOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };
        nums.forEach(printOddEven);
    }
}
