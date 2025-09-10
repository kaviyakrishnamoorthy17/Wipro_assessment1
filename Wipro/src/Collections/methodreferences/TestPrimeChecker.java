package Collections.methodreferences;

@FunctionalInterface
interface PrimeCheckFunction {
    PrimeChecker apply(int n);
}

class PrimeChecker {
    PrimeChecker(int n) {
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    private boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}

public class TestPrimeChecker {
    public static void main(String[] args) {
        PrimeCheckFunction func = PrimeChecker::new; // constructor reference
        func.apply(7);
    }
}
