public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long minutesInAYear = 365 * 24 * 60;
        long years = minutes / minutesInAYear;
        long remainingMinutesOfYears = minutes % minutesInAYear;
        long minutesInADay = 24 * 60;
        long days = remainingMinutesOfYears / minutesInADay;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
