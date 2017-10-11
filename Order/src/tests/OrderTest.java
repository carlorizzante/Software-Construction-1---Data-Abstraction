package tests;

import model.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by carlorizzante on 24/08/17.
 */
public class OrderTest {

    Order o1;
    Order o2;
    Order o3;
    Order o4;
    Order o5;

    private static final float TOL = 1f;

    @Before
    public void setup() {
        o1 = new Order("Jon", 'A');
        o2 = new Order("Janet", 'B');
        o3 = new Order("Drake", 'C');
        o4 = new Order("Kim", 'D');
        o5 = new Order("Julie", 'E');
    }

    @Test
    public void testConstructor() {
        assertEquals("Jon", o1.getCustomerName());
        assertEquals('A', o1.getCombo());
    }


    @Test
    public void testSetTicket() {
        assertTrue(o1.getTicket() < o2.getTicket());
        assertTrue(o2.getTicket() < o3.getTicket());
        assertTrue(o3.getTicket() < o4.getTicket());
        assertTrue(o4.getTicket() < o5.getTicket());
    }


    @Test
    public void testSetPrice() {
        assertEquals(o1.getPrice(), 10.0, TOL);
        assertEquals(o2.getPrice(), 9.5, TOL);
        assertEquals(o3.getPrice(), 11.0, TOL);
        assertEquals(o4.getPrice(), 7.5, TOL);
        assertEquals(o5.getPrice(), 9.0, TOL);
    }


    @Test
    public void testSetComboFood() {
        assertEquals(o1.getComboFood(), "Salad");
        assertEquals(o2.getComboFood(), "Pasta");
        assertEquals(o3.getComboFood(), "Pizza");
        assertEquals(o4.getComboFood(), "Tacos");
        assertEquals(o5.getComboFood(), "Sandwich");
    }


    @Test
    public void testInstructions() {
        o1.instructions("Extra hot");
        o3.instructions("To go");
        assertEquals("Extra hot", o1.getInstructions());
        assertEquals("To go", o3.getInstructions());
    }


    @Test
    public void testProcessingAndCompleted() {
        o1.processing();
        o3.processing();
        o1.completed();
        o5.processing();
        o4.completed();

        assertEquals(o1.isProcessing(), false);
        assertEquals(o1.isCompleted(), true);

        assertEquals(o2.isProcessing(), false);
        assertEquals(o2.isCompleted(), false);

        assertEquals(o3.isProcessing(), true);
        assertEquals(o3.isCompleted(), false);

        assertEquals(o4.isProcessing(), false);
        assertEquals(o4.isCompleted(), true);

        assertEquals(o5.isProcessing(), true);
        assertEquals(o5.isCompleted(), false);
    }
}
