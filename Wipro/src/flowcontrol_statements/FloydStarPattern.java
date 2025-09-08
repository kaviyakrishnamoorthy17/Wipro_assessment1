package flowcontrol_statements;

public class FloydStarPattern {
    public static void main(String[] args) {
        int rows = 3; // Change this to test

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
