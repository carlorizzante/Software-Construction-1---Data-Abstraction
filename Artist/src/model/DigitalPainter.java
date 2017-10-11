package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 26/08/17.
 */
public class DigitalPainter extends Artist {

    public List<Software> programsAvail;
    public Tablet tablet;

    public DigitalPainter() {
        programsAvail = new ArrayList<>();
    }

    @Override
    public void sellArt() {
        portfolio.clear();
        System.out.println("Sold pieces using PayPal.");
    }

    @Override
    public Art createArt() {
        System.out.println("Made new painting.");
        System.out.println("I am a digital painter!");
        return new Art();
    }

    public Art createArt(String title) {
        System.out.println("I made new painting with title " + title +"!");
        System.out.println("I am a digital painter!");
        return new Art();
    }

    public Art draw() {
        return new Art();
    }

    public void mixColor() {}
}
