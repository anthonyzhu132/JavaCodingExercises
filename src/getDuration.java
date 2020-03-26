public class getDuration {
    public static String getDurationString (long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid values";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " +remainingMinutes + "m " + seconds + "s";
    }
}
