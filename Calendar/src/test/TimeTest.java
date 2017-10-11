package test;

import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 27/08/17.
 */
public class TimeTest {

    private Time t1;
    private Time t2;
    private Time t3;
    private Time t4;
    private Time t5;


    @Before
    public void setup() {
        t1 = new Time(1,7);
        t2 = new Time(13,27);
        t3 = new Time(5, "PM", 15);
        t4 = new Time(15, "PM", 53);
        t5 = new Time(7, "AM", 7);
    }

    @Test
    public void test_constructor() {
        assertEquals(1, t1.getHours());
        assertEquals(7, t1.getMinutes());

        assertEquals(13, t2.getHours());
        assertEquals(27, t2.getMinutes());

        assertEquals(17, t3.getHours());
        assertEquals(15, t3.getMinutes());

        assertEquals(15, t4.getHours());
        assertEquals(53, t4.getMinutes());

        assertEquals(7, t5.getHours());
        assertEquals(7, t5.getMinutes());
    }

    @Test
    public void test_get24time() {
        assertEquals("1:07", t1.get24time());
        assertEquals("13:27", t2.get24time());
        assertEquals("17:15", t3.get24time());
        assertEquals("15:53", t4.get24time());
        assertEquals("7:07", t5.get24time());
    }

    @Test
    public void test_get12time() {
        assertEquals("1:07 AM", t1.get12time());
        assertEquals("1:27 PM", t2.get12time());
        assertEquals("5:15 PM", t3.get12time());
        assertEquals("3:53 PM", t4.get12time());
        assertEquals("7:07 AM", t5.get12time());
    }

    @Test
    public void test_getAbsoluteTime() {
        assertEquals(67, t1.getAbsoluteTime());
        assertEquals(13*60+27, t2.getAbsoluteTime());
        assertEquals((5+12)*60+15, t3.getAbsoluteTime());
        assertEquals(15*60+53, t4.getAbsoluteTime());
        assertEquals(7*60+7, t5.getAbsoluteTime());
    }
}
