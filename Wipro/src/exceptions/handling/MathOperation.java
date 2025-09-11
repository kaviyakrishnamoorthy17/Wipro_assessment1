package exceptions.handling;

public class MathOperation {
    public static void main(String[] args) throws Exception {
        if (args.length < 5) {
            System.out.println("Please enter 5 integers as command line arguments");
            return;
        }
        int sum = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(args[i]);
            sum += arr[i];
        }
        double avg = sum / 5.0;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}