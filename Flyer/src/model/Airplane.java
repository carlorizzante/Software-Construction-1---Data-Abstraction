package model;

/**
 * Created by carlorizzante on 25/08/17.
 */
public class Airplane implements Flyer, Cafe {

    @Override
    public void serveDrinks() {
        System.out.println("Serving airplane drinks...");
    }

    @Override
    public void serveSnacks() {
        System.out.println("Serving airplane snacks...");
    }

    @Override
    public void takeOff() {
        System.out.println("Going airborne!!");
    }

    @Override
    public void fly() {
        System.out.println("Love flying...");
    }

    @Override
    public void land() {
        System.out.println("Brace, we attempt landing.");
    }
}
