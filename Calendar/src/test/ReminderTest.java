package test;

import model.Date;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class ReminderTest extends EntryTest {

    @Before
    public void setup() {
        d1 = new Date(7, 11, 1997);
        d2 = new Date(1, 1, 1993);
        d3 = new Date(12, 2, 2001);
        d4 = new Date(11, 3, 1814);
        d5 = new Date(2, 21, 1104);

        t1 = new Time(1,7);
        t2 = new Time(13,27);
        t3 = new Time(5, "PM", 15);
        t4 = new Time(15, "PM", 53);
        t5 = new Time(7, "AM", 7);

        l1 = "Remember me!";
        l2 = "Remember me, too!";
        l3 = "Remember also me!";
        l4 = "Don't forget about me!";
        l5 = "Ok?";

        e1 = new Reminder(d1, t1, l1);
        e2 = new Reminder(d2, t2, l2);
        e3 = new Reminder(d3, t3, l3);
        e4 = new Reminder(d4, t4, l4);
        e5 = new Reminder(d5, t5, l5);
    }

    @Test
    public void test_notes() {
        Reminder r1 = new Reminder(d1, t1, l1);
        r1.setNote("Buy cookies.");
        assertEquals("Buy cookies.", r1.getNote());
    }

}
