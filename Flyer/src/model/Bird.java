package model;

/**
 * Created by carlorizzante on 25/08/17.
 */
public class Bird implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Flap flap...");
    }

    @Override
    public void fly() {
        System.out.println("Fuuuuuusshhh!");
    }

    @Override
    public void land() {
        System.out.println("Ouch.");
    }
}
