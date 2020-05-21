
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Part I: Implement a class Clock whose getHours, getMinutes and getTime
 * methods return the current time at your location. Return the time as a
 * string.
 *
 * There are two ways to retrieve the current time as a String:
 *
 * 1) Before Java 8 use new Date().toString() 2) With Java 8, you can use 3
 * classes in the java.time package: Instant, LocalDateTime and ZoneId. Here's
 * how you do it: String timeString = LocalDateTime.ofInstant(Instant.now(),
 * ZoneId.systemDefault()).toString()
 *
 * With either method, you'll need to extract the hours and minutes as a
 * substring.
 *
 *
 * Add an alarm feature to the Clock class. When setAlarm(hours, minutes) is
 * called, the clock stores the alarm. When you call getTime, and the alarm time
 * has been reached or exceeded, return the time followed by the string "Alarm"
 * and clear the alarm.
 *
 * @author Nick Zelada
 * @version 02/13/19 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class Clock {

    private int alarmHours; // hours of the time

    private int alarmMinutes; // minutes of the time

    /**
     * Sets the alarm.
     *
     * @param hours hours for alarm
     * @param minutes minutes for alarm
     */
    public void setAlarm(int hours, int minutes) {

        alarmHours = hours; // hours for alarm
        alarmMinutes = minutes; // minutes for alarm

    }

    /**
     * gets current time composed of hours and minutes
     *
     * @return time in string;
     */
    public String getTime() {
        // Complete this method
        return getHours() + ":" + getMinutes(); // get both methods

    }

    /**
     * gets hours
     *
     * @return hours of current time in string
     */
    public String getHours() {
        String time = currentTime().split("T")[1]; /*
         splits the string after "T"*/

        time = time.substring(0, 5); // gets the the first 5 characters
        return time.substring(0, 2); /* returns the first 2 characters
         Which is the first 2 digits of Hours
         */

    }

    public String getYear() {
        String year = currentTime();
        year = year.substring(0, 10);
        return year.substring(0, 4);
    }

    public String getDay() {
        String day = currentTime();
        day = day.substring(0, 10);
        return day.substring(8, 10);
    }

    public String getMonth() {
        String month = currentTime();
        month = month.substring(0, 10);
        return month.substring(5, 7);

    }

    public String getDate() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    /**
     * gets minutes
     *
     * @return hours of current time in string
     */
    public String getMinutes() {
        String time = currentTime().split("T")[1]; /*
         splits the string after "T"*/

        time = time.substring(0, 5); // gets the the first 5 characters
        return time.substring(3, 5);/* returns the last 2 characters
         Which is the last 2 digits of Minutes
         */

    }

    /**
     * Returns the current Date and Time as a String.
     */
    private String currentTime() {
        return LocalDateTime.ofInstant(Instant.now(),
                ZoneId.systemDefault()).toString(); // returns the local time
    }
}
