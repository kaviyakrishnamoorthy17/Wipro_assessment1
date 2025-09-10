package Collections.methodreferences;

@FunctionalInterface
interface DigitCountFunction {
    int count(int n);
}

class NumberUtil {
    public static int digitCount(int n) {
        return Integer.toString(Math.abs(n)).length();
    }
}

public class TestDigitCount {
    public static void main(String[] args) {
        DigitCountFunction func = NumberUtil::digitCount; // static method reference
        System.out.println("Digits in 12345: " + func.count(12345));
    }
}
