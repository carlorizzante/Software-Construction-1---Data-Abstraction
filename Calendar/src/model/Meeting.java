package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class Meeting extends Event {

    // Fields
    private List<String> attendees;

    // Constructor
    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
        this.attendees = new ArrayList<>();
    }

    // Getters & Setters
    public List<String> getAttendees() { return attendees; }
    public void setAttendees(List<String> attendees) { this.attendees = attendees; }

    // MODIFIES: this
    // EFFECTS: Adds attendee to attendees list
    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    // MODIFIES: this
    // EFFECTS: Removes attendee from attendees list
    public void removeAttendee(String attendee) {
        if (attendees.contains(attendee)) attendees.remove(attendee);
    }

    // EFFECTS: Prints out invitations - fake
    public void sendInvitations() {
        for (String att : attendees) {
            System.out.println("Inviting " + att + "...");
        }
    }
}
