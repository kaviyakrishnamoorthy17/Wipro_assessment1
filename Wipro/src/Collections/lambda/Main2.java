package Collections.lambda;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 different words
        al.add("Java");
        al.add("Python");
        al.add("C++");
        al.add("Kotlin");
        al.add("Swift");
        al.add("Ruby");
        al.add("Go");
        al.add("Scala");
        al.add("Perl");
        al.add("Rust");

        System.out.println("Original List: " + al);
        System.out.println("Words in Reverse Order:");

        // Print in reverse order using lambda + IntStream
        IntStream.range(0, al.size())
                 .mapToObj(i -> al.get(al.size() - 1 - i))
                 .forEach(word -> System.out.println(word));
    }
}
