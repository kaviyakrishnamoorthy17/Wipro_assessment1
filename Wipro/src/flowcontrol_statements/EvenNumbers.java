package flowcontrol_statements;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
