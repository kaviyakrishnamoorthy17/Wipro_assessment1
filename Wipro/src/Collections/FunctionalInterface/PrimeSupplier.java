package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Supplier;

public class PrimeSupplier {
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primesSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                if (isPrime(num)) primes.add(num);
                num++;
            }
            return primes;
        };

        System.out.println("First 10 prime numbers: " + primesSupplier.get());
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
