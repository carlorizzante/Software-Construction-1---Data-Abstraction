package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class Reminder extends Entry {

    // Fields
    private String note;

    // Getter & Setters
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }

    // Constructor
    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
    }

}
