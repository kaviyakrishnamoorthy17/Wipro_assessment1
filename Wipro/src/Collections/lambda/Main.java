package collections.lambda;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }

        System.out.println("Generated Numbers: " + al);

        System.out.println("Prime Numbers in the list:");
        al.forEach(n -> {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        });
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
