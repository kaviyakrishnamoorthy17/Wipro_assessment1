package interfaces.demo;
public class LambdaExample {
    public static void main(String[] args) {
        // t1 adds three integers
        Test t1 = (a, b, c) -> a + b + c;

        // t2 multiplies three integers
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Sum: " + t1.myFunction(2, 3, 4));
        System.out.println("Product: " + t2.myFunction(2, 3, 4));
    }
}