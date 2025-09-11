package exceptions.custom;
import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) { super(msg); }
}
class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) { super(msg); }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int s = 1; s <= 2; s++) {
            try {
                System.out.print("Enter student " + s + " name: ");
                String name = sc.nextLine();
                int sum = 0;
                for(int i = 1; i <= 3; i++) {
                    System.out.print("Enter marks of subject " + i + ": ");
                    int marks = Integer.parseInt(sc.nextLine());
                    if(marks < 0) throw new NegativeValueException("Negative marks not allowed");
                    if(marks > 100) throw new OutOfRangeException("Marks should be 0-100");
                    sum += marks;
                }
                System.out.println("Average marks of " + name + " = " + (sum/3.0));
            } catch(NumberFormatException e) {
                System.out.println("Please enter valid integer marks");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}







