package flowcontrol_statements;

public class ChangeCase {
    public static void main(String[] args) {
        char ch = 'a'; // Change this to test other letters

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
