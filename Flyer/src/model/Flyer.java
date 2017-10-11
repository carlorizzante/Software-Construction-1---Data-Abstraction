package model;

/**
 * Created by carlorizzante on 25/08/17.
 */
public interface Flyer {

    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS: moves this into air
    public void takeOff();

    // REQUIRES: being on air
    // MODIFIES: this
    // EFFECTS: moves this through air
    public void fly();

    // REQUIRES: being airborne
    // MODIFIES: this
    // EFFECTS: moves this onto land
    public void land();
}
