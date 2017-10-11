package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public abstract class Entry {

    // Fields
    private Date date;
    private Time time;
    private String label;
    private boolean isRepeating;
    private int repeatInterval;

    // Getters
    public Date getDate() { return date; }
    public Time getTime() { return time; }
    public String getLabel() { return label; }
    public boolean isRepeating() { return isRepeating; }
    public int getRepeatInterval() { return repeatInterval; }

    // Setters
    public void setDate(Date date) { this.date = date; }
    public void setTime(Time time) { this.time = time; }
    public void setLabel(String label) { this.label = label; }
    public void setRepeating(boolean repeating) { isRepeating = repeating; }
    public void setRepeatInterval(int repeatInterval) { this.repeatInterval = repeatInterval; }

    // Constructor
    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }

    // REQUIRES: An int for repeatInterval
    // MODIFIES: this
    // EFFECTS: Turns isRepeat to true, set repeatInterval
    public void setRepeat(int repeatInterval) {
        this.isRepeating = true;
        this.repeatInterval = repeatInterval;
    }
}
