package Collection.streamAPI;

import java.util.ArrayList;

public class NegativeEvenFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-4); numbers.add(7); numbers.add(-8); numbers.add(0); numbers.add(-3);

        ArrayList<Integer> negativeEven = new ArrayList<>();
        for (int n : numbers) {
            if (n < 0 && n % 2 == 0) {
                negativeEven.add(n);
            }
        }

        System.out.println("Negative even numbers:");
        for (int n : negativeEven) {
            System.out.println(n);
        }
    }
}
