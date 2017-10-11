package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class Event extends Entry {

    // Fields
    private Reminder reminder;

    // Getters & Setters
    public Reminder getReminder() { return reminder; }
    public void setReminder(Reminder reminder) { this.reminder = reminder; }

    // Constructor
    public Event(Date date, Time time, String label) {
        super(date, time, label);
    }
}
