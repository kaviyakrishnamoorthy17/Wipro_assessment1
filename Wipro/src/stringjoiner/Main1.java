package stringjoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main1 {
    public static void main(String[] args) {
        // Create an ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Use StringJoiner with comma as delimiter and { } as brackets
        StringJoiner sj = new StringJoiner(",", "{", "}");
        for (String name : names) {
            sj.add(name);
        }

        // Print the resulting string
        System.out.println(sj.toString());
    }
}
