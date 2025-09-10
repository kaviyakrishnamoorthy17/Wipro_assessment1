package stringjoiner;

import java.util.StringJoiner;

public class MergeStringJoiners {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("NewYork").add("London").add("Paris");

        StringJoiner s2 = new StringJoiner("-", "{", "}");
        s2.add("Tokyo").add("Berlin").add("Sydney");

        // i) Merge s1 into s2
        StringJoiner merged1 = new StringJoiner("-", "{", "}");
        merged1.merge(s1); // merge s1 into merged1
        merged1.add("Tokyo").add("Berlin").add("Sydney"); // add s2 elements
        System.out.println("s1 merged to s2: " + merged1);

        // ii) Merge s2 into s1
        StringJoiner merged2 = new StringJoiner("-", "[", "]");
        merged2.merge(s2); // merge s2 into merged2
        merged2.add("NewYork").add("London").add("Paris"); // add s1 elements
        System.out.println("s2 merged to s1: " + merged2);
    }
}

