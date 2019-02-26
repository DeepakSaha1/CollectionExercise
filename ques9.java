// Write a program to display times in different country format.
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");

        date.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(date.format(new Date()) + ": " + date.getTimeZone().getDisplayName());

        date.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println(date.format(new Date()) + ": " + date.getTimeZone().getDisplayName());

        date.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println(date.format(new Date()) + ": " + date.getTimeZone().getDisplayName());

        date.setTimeZone(TimeZone.getTimeZone("Australia/Canberra"));
        System.out.println(date.format(new Date()) + ": " + date.getTimeZone().getDisplayName());
    }
}
