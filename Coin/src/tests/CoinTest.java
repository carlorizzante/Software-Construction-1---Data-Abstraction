package tests;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/**
 * Created by carlorizzante on 23/08/17.
 */
public class CoinTest {

    private Coin c;

    @Before
    public void setup() {
        c = new Coin();
    }


    // Initial version
    @Test
    public void testFlip() {
        int state = 0;
        int reps = 1000;
        int check = reps / 20;
        for (int i = 0; i < reps; i++) {
            c.flip();
            if (c.checkStatus() == "tail") {
                state += 1;
            } else {
                state -= 1;
            }
        }
        if (abs(state) > check) {
            System.out.println("State is " + state);
            fail();
        }
    }


    // Make sure not getting always same result
    @Test
    public void testFlipHeadsAndTails() {
        int timesChanged = 0;
        String lastStatus = "head";
        for (int i = 0; i < 10; i++) {
            c.flip();
            String status = c.checkStatus();
//            System.out.println(status);
            if (!status.equals(lastStatus)) {
                timesChanged++;
                lastStatus = status;
            }
        }
        assertFalse(timesChanged == 0);
    }


    // Test to ensure the same value isn't returned > 10
/*    @Test
    public void testFlipRandomness() {
        int timesChanged = 0;
        String lastStatus = "head";
        int longestRunOfSameAnswer = 0;
        int currentRun = 0;
        for (int i = 0; i < 100; i++) {
            c.flip();
            String status = c.checkStatus();
//            System.out.println(status);
            if (!status.equals(lastStatus)) {
                timesChanged++;
                lastStatus = status;
                currentRun++;
                if (currentRun > longestRunOfSameAnswer) {
                    longestRunOfSameAnswer = currentRun;
                }
            } else {
                currentRun = 0;
            }
        }
        assertTrue(longestRunOfSameAnswer > 0);
    }*/

}
