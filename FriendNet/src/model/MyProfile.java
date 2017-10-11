package model;

import java.util.ArrayList;
import java.util.List;

public class MyProfile {

    private String name;
    private int age;
    private String currentLocation;
    private String workPlace;
    private List<MyProfile> friendsList;
    private List<Event> upcomingEvents;

    public MyProfile(String name, int age, String location, String work) {
        this.name = name;
        this.age = age;
        this.currentLocation = location;
        this.workPlace = work;
        this.friendsList = new ArrayList<>();
        this.upcomingEvents = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCurrentLocation() { return currentLocation; }
    public String getWorkPlace() { return workPlace; }
    public List<MyProfile> getFriendsList() { return friendsList; }
    public List<Event> getEventList() { return upcomingEvents; }
    public int upcomingEventNum() { return upcomingEvents.size(); }


    // REQUIRES: f is not already in friendsList
    // MODIFIES: this
    // EFFECTS: consumes a MyProfile object, a friend f, and adds it to the friendsList
    public void addFriend(MyProfile f) {
        if (!friendsList.contains(f)) friendsList.add(f);
    }

    // MODIFIES: this
    // EFFECTS: removes a friend with the given name from this. If removal is successful, return true, else
    //          return false
    public boolean unFriend(String name) {
        MyProfile unfriend = null;
        List<MyProfile> friendsList = getFriendsList();
        for (MyProfile f : friendsList) {
            if (name == f.getName()) unfriend = f;
            if (unfriend != null) {
                friendsList.remove(unfriend);
                return true;
            }
        }
        return false;
    }

    // REQUIRES: ev is not in upcomingEvents
    // MODIFIES: this
    // EFFECTS: adds the given event to the list of upcoming events
    public void addEvent(Event ev) {
        upcomingEvents.add(ev);
    }

    // MODIFIES: this
    // EFFECTS: removes an event with the given name. If removal is successful, return true, else return false
    public boolean removeEvent(String evname) {
        Event ev = null;
        for (Event e : upcomingEvents) {
            if (e.getName() == evname) ev = e;
        }
        upcomingEvents.remove(ev);
        // if: ev successfully removed - or hasn't been found - return false
        if (upcomingEvents.contains(ev) || ev == null) return false;
        // else: assume ev successfully removed
        return true;
    }

    // EFFECTS: returns the number of events that are at the current location of this person
    public int eventNumNearMe() {
        int evNum = 0;
        for (Event ev : upcomingEvents) {
            if (ev.getLocation() == currentLocation) evNum++;
        }
        return evNum;
    }

    // EFFECTS: returns the number of events of the given type et
    public int specificEventType(EventType et) {
        int evNum = 0;
        for (Event ev : upcomingEvents) {
            if (ev.getEventType() == et) evNum++;
        }
        return evNum;
    }

    // EFFECTS: prints events of  type et to the console
    //          Hint: is there a method you have already written that you can use?
    public void printEventSchedule(EventType et) {
        for (Event ev : upcomingEvents) {
            if (ev.getEventType() == et) System.out.println(ev.getName() + ", on the " + ev.getDate());
        }
    }

    // EFFECTS: prints out the list of friends that this MyProfile has
    public void printFriendNames() {
        for (MyProfile f : friendsList) System.out.println(f.getName());
    }

    // EFFECTS: prints out the names of friends who live at the same location associated with this profile
    public void printFriendsNearMe() {
        for (MyProfile f: friendsList) {
            if (f.getCurrentLocation() == currentLocation) System.out.println(f.getName());
        }
    }

    // EFFECTS: produces true if this profile has a friend with the given name,
    //          OR if any of this profile's friends has a friend with the given name
    //          Hint: use recursion!
    public boolean canFindPerson(String name) {
        boolean result = false;
        for (MyProfile f : getFriendsList()) {
            if (f.getName() == name) {
                return true;
            } else {
                result = result || f.canFindPerson(name);
            }
        }
        return result;
    }


}
