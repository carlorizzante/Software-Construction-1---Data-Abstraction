package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 26/08/17.
 */
public class Calendar {

    // Fields
    private Date currentDate;
    private String account;
    private List<Entry> entries;

    // Setters
    public void setCurrentDate(Date currentDate) { this.currentDate = currentDate; }
    public void setAccount(String account) { this.account = account; }

    // Getters
    public Date getCurrentDate() { return currentDate; }
    public String getAccount() { return account; }
    public List<Entry> getEntries() { return entries; }

    // Constructor
    public Calendar(Date currentDate, String account) {
        this.currentDate = currentDate;
        this.account = account;
        this.entries = new ArrayList<>();
    }

    // REQUIRES: A valid entry
    // MODIFIES: this
    // EFFECTS: Adds entry to entries list
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    // REQUIRES: A valid entry
    // MODIFIES: this
    // EFFECTS: Removes entry from entries list
    public void removeEntry(Entry entry) {
        entries.remove(entry);
    }

    // EFFECTS: Returns a list of entries as strings - labels
    public List<String> entriesByLabel() {
        List<String> result = new ArrayList<>();
        for (Entry e : entries) {
            result.add(e.getLabel());
        }
        return result;
    }

    // REQUIRES: At least two registered entries in calendar
    // EFFECTS: Returns soonest entry as Entry
    public Entry soonestEntry() {
        Entry soonestEntry = entries.get(0);
        for (Entry e : entries) soonestEntry = earliest(e, soonestEntry);
        return soonestEntry;
    }

    // REQUIRES: At least two registered entries in calendar
    // EFFECTS: Returns soonest entry as Entry
    private Meeting soonestMeetingHelper(List<Entry> entries) {
        Entry soonestEntry = entries.get(0);
        for (Entry e : entries) soonestEntry = earliest(e, soonestEntry);
        return (Meeting) soonestEntry;
    }

    // EFFECTS: Returns soonestMeeting
    public Meeting soonestMeeting() {
        List<Entry> meetings = new ArrayList<>();
        for (Entry e : entries) {
            if (e instanceof Meeting) {
                meetings.add(e);
            }
        }
        if (meetings.size() == 0) return null;
        if (meetings.size() == 1) return (Meeting) meetings.get(0);
        return soonestMeetingHelper(meetings);
    }

    // REQUIRES: Valid entries for arguments
    // EFFECTS: Returns true the earliest entry of the two based on Date and Time
    private Entry earliest(Entry e1, Entry e2) {
        int d1 = e1.getDate().getAbsoluteDate();
        int d2 = e2.getDate().getAbsoluteDate();
        if (d1 < d2) {
            return e1;
        } else if (d1 > d2) {
            return e2;
        } else {
            int t1 = e1.getTime().getAbsoluteTime();
            int t2 = e2.getTime().getAbsoluteTime();
            if (t1 <= t2) {
                return e1;
            } else {
                return e2;
            }
        }

    }
}
