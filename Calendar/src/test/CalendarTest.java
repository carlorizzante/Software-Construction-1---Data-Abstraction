package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class CalendarTest {

    public Calendar c1;
    public Date cd1;
    public String a1;

    public Event e1;
    public Meeting m2;
    public Reminder r3;

    public Date d1;
    public Date d2;
    public Date d3;
    public Date d4;
    public Date d5;

    public Time t1;
    public Time t2;
    public Time t3;
    public Time t4;
    public Time t5;

    public String l1;
    public String l2;
    public String l3;

    @Before
    public void setup() {
        cd1 = new Date(8, 28, 2017);
        a1 = "Jon Snow";
        c1 = new Calendar(cd1, a1);

        d1 = new Date(1,1,2018);
        d2 = new Date(12,25,2018);
        d3 = new Date(8,15,2018);
        d4 = new Date(8,15,2019);
        d5 = new Date(8,15,2017);

        t1 = new Time(17, 23);
        t2 = new Time(10, "AM", 54);
        t3 = new Time(3, "PM", 33);
        t4 = new Time(10, 55);
        t5 = new Time(10, 53);

        l1 = "Meetings are boring";
        l2 = "Let's do it!";
        l3 = "Gonna get rich";

        e1 = new Event(d1, t1, l1);
        m2 = new Meeting(d2, t2, l2);
        r3 = new Reminder(d3, t3, l3);
    }

    @Test
    public void test_constructor() {
        assertEquals(cd1, c1.getCurrentDate());
        assertEquals(a1, c1.getAccount());
        assertEquals(new ArrayList<>(), c1.getEntries());
        assertEquals(0, c1.getEntries().size());
    }

    @Test
    public void test_addEntry() {
        assertEquals(0, c1.getEntries().size());
        c1.addEntry(e1);
        c1.addEntry(m2);
        c1.addEntry(r3);
        assertEquals(3, c1.getEntries().size());
    }

    @Test
    public void test_removeEntry() {
        c1.addEntry(e1);
        c1.addEntry(m2);
        c1.addEntry(r3);
        assertEquals(3, c1.getEntries().size());
        c1.removeEntry(m2);
        assertEquals(2, c1.getEntries().size());
        assertEquals(r3, c1.getEntries().get(1));
    }

    @Test
    public void test_entriesByLabel() {
        List<String> result = new ArrayList<>();
        assertEquals(result, c1.entriesByLabel());
        c1.addEntry(e1);
        c1.addEntry(m2);
        c1.addEntry(r3);
        result.add(l1);
        result.add(l2);
        result.add(l3);
        assertEquals(result, c1.entriesByLabel());
    }

    @Test
    public void test_soonestEntry_byDate() {
        c1.addEntry(m2);
        c1.addEntry(r3);
        assertEquals(r3, c1.soonestEntry());

        c1.addEntry(e1);
        assertEquals(e1, c1.soonestEntry());

        Event e4 = new Event(d4,t4,"...");
        Meeting m5 = new Meeting(d5,t5,"...");
        c1.addEntry(e4);
        c1.addEntry(m5);
        assertEquals(m5, c1.soonestEntry());
    }

    @Test
    public void test_soonestEntry_byTime() {
        Event e1 = new Event(d1, t1, "...");
        Event e2 = new Event(d1, t2, "...");
        Event e3 = new Event(d1, t3, "...");
        c1.addEntry(e1);
        c1.addEntry(e2);
        c1.addEntry(e3);
        assertEquals(e2, c1.soonestEntry());

        Meeting m4 = new Meeting(d1, t4, "...");
        c1.addEntry(m4);
        assertEquals(e2, c1.soonestEntry());

        Meeting m5 = new Meeting(d1, t5, "...");
        c1.addEntry(m5);
        assertEquals(m5, c1.soonestEntry());
    }

    @Test
    public void test_soonestMeeting() {
        c1.addEntry(e1);
        c1.addEntry(m2);
        c1.addEntry(r3);
        assertEquals(m2, c1.soonestMeeting());

        Meeting m4 = new Meeting(d4, t4, "...");
        c1.addEntry(m4);
        assertEquals(m2, c1.soonestMeeting());

        Meeting m5 = new Meeting(d5, t5, "...");
        c1.addEntry(m5);
        assertEquals(m5, c1.soonestMeeting());
    }
}
