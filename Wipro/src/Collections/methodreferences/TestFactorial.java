package Collections.methodreferences;

@FunctionalInterface
interface FactorialFunction {
    int compute(int n);
}

class MyMath {
    public int factorial(int n) {
        int f = 1;
        for(int i = 2; i <= n; i++) f *= i;
        return f;
    }
}

public class TestFactorial {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        FactorialFunction func = math::factorial; // instance method reference
        System.out.println("Factorial of 5: " + func.compute(5));
    }
}
