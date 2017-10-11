package ui;

import model.Coin;

/**
 * Created by carlorizzante on 22/08/17.
 */
public class Main {


    private static int flips = 20;


    public static void main(String[] args) {

        Coin coin = new Coin();

        for (int i = 0; i < flips; i++) {
            coin.flip();
        }

        System.out.print(coin.checkStatus() + "\n");

    }
}
