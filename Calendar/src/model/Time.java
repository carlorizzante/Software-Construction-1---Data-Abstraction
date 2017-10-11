package model;

/**
 * Created by carlorizzante on 27/08/17.
 */
public class Time {

    // fields
    private int hours;
    private int minutes;
    private String period;

    // constructor for 24 hours based
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        if (hours <= 12) {
            this.period = "AM";
        } else {
            this.period = "PM";
        }
    }

    // constructor for 12 AM/PM based
    public Time(int hours, String period, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.period = period;

        if (hours <= 12 && period == "PM") this.hours += 12;
    }

    // getters
    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }

    // EFFECTS: Returns European time, 24 hours format
    public String get24time() {
        return String.format("%d:%02d", hours, minutes);
    }

    // EFFECTS: Returns American time, 12 AM/PM format
    public String get12time() {
        return String.format("%d:%02d %s", calc12Hours(), minutes, period);
    }

    // EFFECTS: Returns time as absolute natural
    public int getAbsoluteTime() {
        return 60 * getHours() + getMinutes();
    }

    // EFFECTS: Returns hours conversion from 24 to 12 AM/PM
    private int calc12Hours() {
        if (period == "PM") return hours - 12;
        return hours;
    }

}
