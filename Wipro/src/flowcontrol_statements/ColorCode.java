package flowcontrol_statements;

public class ColorCode {
    public static void main(String[] args) {
        char code = 'G'; // Change this to test other codes

        if (code == 'R' || code == 'r') {
            System.out.println("Red");
        } else if (code == 'B' || code == 'b') {
            System.out.println("Blue");
        } else if (code == 'G' || code == 'g') {
            System.out.println("Green");
        } else if (code == 'O' || code == 'o') {
            System.out.println("Orange");
        } else if (code == 'Y' || code == 'y') {
            System.out.println("Yellow");
        } else if (code == 'W' || code == 'w') {
            System.out.println("White");
        } else {
            System.out.println("Invalid Code");
        }
    }
}
