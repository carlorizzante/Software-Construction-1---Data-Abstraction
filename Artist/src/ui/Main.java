package ui;

import model.Artist;
import model.DigitalPainter;
import model.Photographer;

/**
 * Created by carlorizzante on 26/08/17.
 */
public class Main {

    public static void main(String[] args) {
        Photographer ansel = new Photographer();
        Artist dorothea = new Photographer();
        DigitalPainter ade = new DigitalPainter();
        Artist michael = new DigitalPainter();

        dorothea.createArt();
//        dorothea.createArt("Migrant Mother");

        ade.sellArt();
        ansel.sellArt();
        dorothea.sellArt();
        michael.sellArt();
    }
}
