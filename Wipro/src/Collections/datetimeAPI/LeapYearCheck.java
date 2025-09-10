package Collections.datetimeAPI;

import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        boolean isLeap = LocalDate.now().isLeapYear();

        System.out.println("Current year: " + year);
        if (isLeap) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
