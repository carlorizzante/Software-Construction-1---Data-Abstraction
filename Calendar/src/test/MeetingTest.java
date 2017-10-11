package test;

import model.Date;
import model.Meeting;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class MeetingTest extends EventTest {

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

        l1 = "Meetings are boring";
        l2 = "Let's do it!";
        l3 = "Gonna get rich";
        l4 = "Just another meeting";
        l5 = "No more meetings, please";

        e1 = new Meeting(d1, t1, l1);
        e2 = new Meeting(d2, t2, l2);
        e3 = new Meeting(d3, t3, l3);
        e4 = new Meeting(d4, t4, l4);
        e5 = new Meeting(d5, t5, l5);
    }

    @Test
    public void test_allAttendees() {
        Meeting m1 = new Meeting(d1, t1, l1);
        assertEquals(new ArrayList(), m1.getAttendees());
        assertEquals(0, m1.getAttendees().size());
        m1.addAttendee("Jon");
        m1.addAttendee("Janet");
        m1.addAttendee("Kim");
        assertEquals(3, m1.getAttendees().size());
        assertEquals("Kim", m1.getAttendees().get(2));
        m1.removeAttendee("Janet");
        assertEquals(2, m1.getAttendees().size());
        assertEquals("Kim", m1.getAttendees().get(1));

    }

}
