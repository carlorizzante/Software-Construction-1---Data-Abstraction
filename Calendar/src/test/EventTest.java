package test;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class EventTest extends EntryTest {

    @Before
    public void setup() {
        d1 = new Date(7, 11, 2006);
        d2 = new Date(1, 1, 1973);
        d3 = new Date(12, 2, 2001);
        d4 = new Date(11, 3, 1814);
        d5 = new Date(2, 21, 1104);

        t1 = new Time(1,7);
        t2 = new Time(13,27);
        t3 = new Time(5, "PM", 15);
        t4 = new Time(15, "PM", 53);
        t5 = new Time(7, "AM", 7);

        l1 = "Matteo's Birthday";
        l2 = "Date with Julie";
        l3 = "Pay taxes";
        l4 = "Somethings' going on today.";
        l5 = "Holiday!!!";

        e1 = new Event(d1, t1, l1);
        e2 = new Event(d2, t2, l2);
        e3 = new Event(d3, t3, l3);
        e4 = new Event(d4, t4, l4);
        e5 = new Event(d5, t5, l5);
    }

    @Test
    public void test_setAndGetReminder() {
        Event e1 = new Event(d1, t1, l1);
        Reminder r2 = new Reminder(d2, t2, l2);
        Reminder r3 = new Reminder(d3, t3, l3);
        assertEquals(null, e1.getReminder());
        e1.setReminder(r2);
        assertEquals(r2, e1.getReminder());
        e1.setReminder(r3);
        assertEquals(r3, e1.getReminder());
    }

}
