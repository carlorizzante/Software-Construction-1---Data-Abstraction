package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 26/08/17.
 */
public abstract class Artist {

    public String name;
    public List<Art> portfolio;

    public Artist() {
        portfolio = new ArrayList<>();
    }

    public void sellArt() {
        portfolio.clear();
        System.out.println("Sold pieces.");
    }

    public void addToPortfolio(Art piece) {
        portfolio.add(piece);
    }

    public abstract Art createArt();

//    public abstract Art createArt(String s);
}
