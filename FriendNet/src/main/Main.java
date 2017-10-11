package main;

import model.Event;
import model.MyProfile;

import static model.EventType.*;

public class Main {

    private static void spacer() { System.out.println(""); }

    public static void main(String[] args) {
        MyProfile mainProfile = new MyProfile("Johnny Appleseed", 20, "Coquitlam", "SPL");
        MyProfile friend1 = new MyProfile("Paul Carter", 30, "London", "Network Systems");
        MyProfile friend2 = new MyProfile("Alan Turing", 24, "Coquitlam", "A Thinking Ape");
        MyProfile friend3 = new MyProfile("Ada Lovelace", 40, "Coquitlam", "AppNeta");
        MyProfile friend4 = new MyProfile("Alfonzo Church", 50, "New York City", "NYU Research");
        MyProfile friend5 = new MyProfile("Bob Ross", 44, "Chicago", "CBS");

        mainProfile.addFriend(friend1);
        mainProfile.addFriend(friend2);
        mainProfile.addFriend(friend3);
        mainProfile.addFriend(friend4);
        mainProfile.addFriend(friend5);

        Event ev1 = new Event("John's Wedding", "May 20", "Coquitlam", WEDDING);
        Event ev2 = new Event("Celina's Party", "May 11", "2298 West 4th Avenue", PARTY);
        Event ev3 = new Event("Anthony's Birthday", "August 29", "Coquitlam", BIRTHDAY);
        Event ev4 = new Event("Bill's Lecture", "May 4", "2366 Main Mall", SCHOOL);
        Event ev5 = new Event("Amanda's Wedding", "June 19", "Copenhagen", WEDDING);

        mainProfile.addEvent(ev1);
        mainProfile.addEvent(ev2);
        mainProfile.addEvent(ev3);
        mainProfile.addEvent(ev4);
        mainProfile.addEvent(ev5);

        System.out.print("Searching for Paul Carter in friends list: ");
        System.out.println(mainProfile.canFindPerson("Paul Carter"));
        spacer();

        System.out.println("Friends:");
        mainProfile.printFriendNames();
        spacer();

        System.out.println("Friends near me:");
        mainProfile.printFriendsNearMe();
        spacer();

        System.out.println("Wedding events:");
        mainProfile.printEventSchedule(WEDDING);
    }


}
