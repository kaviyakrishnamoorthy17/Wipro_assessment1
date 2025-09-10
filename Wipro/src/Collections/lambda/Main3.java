package collections.lambda;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("Java");
        al.add("Python");
        al.add("Kotlin");
        al.add("Swift");
        al.add("Ruby");
        al.add("Go");
        al.add("Scala");
        al.add("Perl");
        al.add("Rust");
        al.add("Csharp");

        System.out.println("Original List: " + al);
        System.out.println("Words with Odd Length:");

        // Print words whose length is odd using lambda
        al.stream()
          .filter(word -> word.length() % 2 != 0)
          .forEach(word -> System.out.println(word));
    }
}
