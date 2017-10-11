package test;

import model.Date;
import model.Entry;
import model.Time;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by carlorizzante on 28/08/17.
 */
public abstract class EntryTest {

    public Entry e1;
    public Entry e2;
    public Entry e3;
    public Entry e4;
    public Entry e5;

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
    public String l4;
    public String l5;

//    @Before
//    public abstract void setup();

    @Test
    public void test_constructor() {
        assertEquals(d1, e1.getDate());
        assertEquals(t1, e1.getTime());
        assertEquals(l1, e1.getLabel());

        assertEquals(d2, e2.getDate());
        assertEquals(t2, e2.getTime());
        assertEquals(l2, e2.getLabel());

        assertEquals(d3, e3.getDate());
        assertEquals(t3, e3.getTime());
        assertEquals(l3, e3.getLabel());

        assertEquals(d4, e4.getDate());
        assertEquals(t4, e4.getTime());
        assertEquals(l4, e4.getLabel());

        assertEquals(d5, e5.getDate());
        assertEquals(t5, e5.getTime());
        assertEquals(l5, e5.getLabel());
    }

    @Test
    public void test_setRepeat() {
        assertFalse(e1.isRepeating());
        e1.setRepeat(100);
        assertTrue(e1.isRepeating());
        assertEquals(100, e1.getRepeatInterval());

        assertFalse(e2.isRepeating());
        e2.setRepeat(250);
        assertTrue(e2.isRepeating());
        assertEquals(250, e2.getRepeatInterval());

        assertFalse(e3.isRepeating());
        e3.setRepeat(1000);
        assertTrue(e3.isRepeating());
        assertEquals(1000, e3.getRepeatInterval());

        assertFalse(e4.isRepeating());
        e4.setRepeat(367);
        assertTrue(e4.isRepeating());
        assertEquals(367, e4.getRepeatInterval());

        assertFalse(e5.isRepeating());
        e5.setRepeat(945);
        assertTrue(e5.isRepeating());
        assertEquals(945, e5.getRepeatInterval());
    }


}
