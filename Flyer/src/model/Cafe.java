package model;

/**
 * Created by carlorizzante on 25/08/17.
 */
public interface Cafe {

    // MODIFIES: this
    // EFFECTS: prints out a list of drinks served
    public void serveDrinks();

    // MODIFIES: this
    // EFFECTS: prints out a list of snacks served
    public void serveSnacks();
}
