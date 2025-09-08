package flowcontrol_statements;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234; // Change this to test
        int sum = 0;

        for (; number != 0; number /= 10) {
            sum += number % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
