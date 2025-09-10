package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "hello", "car", "apple", "mom", "dad", "star", "sun", "pen", "dog"));

        Consumer<ArrayList<String>> reverseAll = list -> {
            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };
        reverseAll.accept(words);

        System.out.println("Reversed words: " + words);
    }
}
