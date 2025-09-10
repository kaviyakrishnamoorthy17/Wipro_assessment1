package Collections.datetimeAPI;

import java.time.LocalTime;

public class TimeBeforeHoursMinutes {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime before = now.minusHours(6).minusMinutes(30);

        System.out.println("Current time: " + now);
        System.out.println("Time before 6 hours and 30 minutes: " + before);
    }
}
