package javafundamentals.languagebasics;

public class Sample {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length < 1) {
            System.out.println("Please provide a name as an argument.");
            return;
        }

        String name = args[0]; // first argument
        System.out.println("Welcome " + name);
    }
}
