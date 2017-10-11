package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public abstract class Marketplace {

    public String location;

    public abstract void addProduct();

    public void sellProduct() {
        System.out.println("Marketplace.sellProduct()");
    }
}
