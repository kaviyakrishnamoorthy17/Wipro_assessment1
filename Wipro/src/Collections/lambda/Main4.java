package collections.lambda;

//Functional interface
@FunctionalInterface
interface WordCount {
 int count(String str);
}

public class Main4 {
 public static void main(String[] args) {
     // Implement count() using Lambda Expression
     WordCount wc = (str) -> {
         if (str == null || str.trim().isEmpty()) {
             return 0;
         }
         // Split string by spaces and count words
         return str.trim().split("\\s+").length;
     };

     // Test the lambda
     String sentence = "Java is a powerful programming language";
     int wordCount = wc.count(sentence);

     System.out.println("Input String: " + sentence);
     System.out.println("Number of words: " + wordCount);
 }
}
