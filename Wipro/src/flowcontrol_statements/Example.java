package flowcontrol_statements;

public class Example {
    public static void main(String[] args) {
        // Check if any command line arguments are passed
        if (args.length == 0) {
            System.out.println("No Values");
        } else {
            // Print all arguments separated by commas
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
        }
    }
}
