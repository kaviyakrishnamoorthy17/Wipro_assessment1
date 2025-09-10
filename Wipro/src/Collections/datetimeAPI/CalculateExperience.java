package Collections.datetimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class CalculateExperience {
    public static void main(String[] args) {
        LocalDate joinDate = LocalDate.of(2022, 4, 15); // Example join date
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joinDate, today);
        System.out.println("Experience: " + experience.getYears() + " years, "
                + experience.getMonths() + " months, "
                + experience.getDays() + " days");
    }
}
