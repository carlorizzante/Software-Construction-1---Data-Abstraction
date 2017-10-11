package test;

import model.Date;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 27/08/17.
 */
public class DateTest {

    private Date d1;
    private Date d2;
    private Date d3;
    private Date d4;
    private Date d5;

    @Before
    public void setup() {
        d1 = new Date(7, 11, 1997);
        d2 = new Date(1, 1, 1993);
        d3 = new Date(12, 2, 2001);
        d4 = new Date(11, 3, 1814);
        d5 = new Date(2, 21, 1104);
    }

    @Test
    public void test_constructor() {
        assertEquals(7, d1.getMonth());
        assertEquals(11, d1.getDay());
        assertEquals(1997, d1.getYear());
    }

    @Test
    public void test_getFullDate() {
        assertEquals("July 11th, 1997", d1.getFullDate());
        assertEquals("January 1st, 1993", d2.getFullDate());
        assertEquals("December 2nd, 2001", d3.getFullDate());
        assertEquals("November 3rd, 1814", d4.getFullDate());
        assertEquals("February 21st, 1104", d5.getFullDate());
    }

    @Test
    public void test_getShortDate() {
        assertEquals("07/11/1997", d1.getShortDate());
        assertEquals("01/01/1993", d2.getShortDate());
        assertEquals("12/02/2001", d3.getShortDate());
        assertEquals("11/03/1814", d4.getShortDate());
        assertEquals("02/21/1104", d5.getShortDate());
    }

    @Test
    public void test_get365day() {
        assertEquals(192, d1.get365day());
        assertEquals(1, d2.get365day());
        assertEquals(336, d3.get365day());
        assertEquals(307, d4.get365day());
        assertEquals(52, d5.get365day());
    }

    @Test
    public void test_getAbsoluteDate() {
        assertEquals(365*1997+192, d1.getAbsoluteDate());
        assertEquals(365*1993+1, d2.getAbsoluteDate());
        assertEquals(365*2001+336, d3.getAbsoluteDate());
        assertEquals(365*1814+307, d4.getAbsoluteDate());
        assertEquals(365*1104+52, d5.getAbsoluteDate());
    }

}
