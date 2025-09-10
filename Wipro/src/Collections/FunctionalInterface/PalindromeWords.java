package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

public class PalindromeWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
            "madam", "apple", "level", "banana", "noon", "racecar", "car", "dad", "java", "stats"
        ));

        Predicate<String> isPalindrome = w -> new StringBuilder(w).reverse().toString().equals(w);

        ArrayList<String> palindromes = new ArrayList<>();
        for (String w : words) {
            if (isPalindrome.test(w)) {
                palindromes.add(w);
            }
        }

        System.out.println("Palindrome words: " + palindromes);
    }
}
