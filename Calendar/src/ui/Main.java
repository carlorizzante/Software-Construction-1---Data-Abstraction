package ui;

import model.*;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class Main {

    private static Calendar c1;
    private static Calendar c2;

    public static void main(String[] args) {

        Date d0 = new Date(3,3,1973);

        String a1 = "Jon Snow";
        String a2 = "Kim Wilde";

        c1 = new Calendar(d0, a1);
        c2 = new Calendar(d0, a2);

        Date d1 = new Date(1,1,1998);
        Date d2 = new Date(12,21,1998);
        Date d3 = new Date(7,14,2001);
        Date d4 = new Date(3,7,1999);
        Date d5 = new Date(5,17,2017);

        Time t1 = new Time(12,34);
        Time t2 = new Time(10,13);
        Time t3 = new Time(7,56);
        Time t4 = new Time(17,23);
        Time t5 = new Time(21,17);

        String l1 = "Prince at Vega.";
        String l2 = "Mattias' Birthday.";
        String l3 = "Pay taxes.";
        String l4 = "Kick asses.";
        String l5 = "Meetup in Berlin.";

        Event e1 = new Event(d1,t1,l1);
        Event e2 = new Event(d2,t2,l2);
        Reminder r3 = new Reminder(d3,t3,l3);
        Meeting m4 = new Meeting(d4,t4,l4);
        Meeting m5 = new Meeting(d5,t5,l5);

        c1.addEntry(e1);
        c1.addEntry(e2);
        c1.addEntry(r3);
        c1.addEntry(m4);
        c1.addEntry(m5);

        Entry soonest = c1.soonestEntry();
        Meeting soonestM = c1.soonestMeeting();

        System.out.println("Soonest Entry is " + soonest.getLabel());
        System.out.println("Soonest Meeting is " + soonestM.getLabel());

    }
}
