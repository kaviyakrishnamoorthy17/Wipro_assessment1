package Collections.datetimeAPI;

import java.time.LocalDate;

public class DateAfterTenDays {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterTen = today.plusDays(10);

        System.out.println("Today's date: " + today);
        System.out.println("Date after ten days: " + afterTen);
    }
}
