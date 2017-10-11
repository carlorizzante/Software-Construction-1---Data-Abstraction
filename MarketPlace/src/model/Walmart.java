package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public class Walmart extends Grocery {

    public void sellProduct(Clothes c) {
        System.out.println("Walmart.sellProduct(Clothes c)");
    }

    public void sellProduct(Bicycle c) {
        System.out.println("Walmart.sellProduct(Bicycle b)");
    }

}
