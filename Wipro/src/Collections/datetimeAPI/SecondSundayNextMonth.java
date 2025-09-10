package Collections.datetimeAPI;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class SecondSundayNextMonth {
    public static void main(String[] args) {
        LocalDate nextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        int sundayCount = 0;
        LocalDate secondSunday = null;
        for (int i = 1; i <= nextMonth.lengthOfMonth(); i++) {
            LocalDate date = nextMonth.withDayOfMonth(i);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    secondSunday = date;
                    break;
                }
            }
        }
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}
