package model;

import java.util.Random;

/**
 * Created by carlorizzante on 22/08/17.
 */
public class Coin {

    private String status;
    private Random ran = new Random();

    public Coin() {
        flip();
    }


    // REQUIRES: none
    // MODIFIES: this
    // EFFECTS: none
    public void flip() {
        Boolean b = ran.nextBoolean();
        if (b) {
            this.status = "head";

        } else {
            this.status = "tail";
        }
    }


    // REQUIRES: none
    // MODIFIES: none
    // EFFECTS: Returns the status of the coin as string, "head" or "tail"
    public String checkStatus() { return this.status; }
}
