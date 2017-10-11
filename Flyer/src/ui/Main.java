package ui;

import model.*;

/**
 * Created by carlorizzante on 25/08/17.
 */
public class Main {

    public static void main(String[] args) {

        Bird birdie = new Bird();
        Airplane planie = new Airplane();
        Cafe aircafe = new Airplane();
        Flyer flyer = new Airplane();

        birdie.takeOff();
        birdie.fly();
        birdie.land();

        planie.takeOff();
        planie.fly();
        planie.serveDrinks();
        planie.serveSnacks();
        planie.land();

        aircafe.serveDrinks();
        aircafe.serveSnacks();

        //

        Main main = new Main();

        main.lunchService(aircafe);
        main.cruise(planie);

        main.lunchService(planie);

        //

        Airplane lux1 = new PrivatePlane();

        main.lunchService(lux1);
        main.cruise(lux1);

        PrivatePlane lux2 = new PrivatePlane();

        main.luxuryCruise(lux2);
    }

    public void lunchService(Cafe c) {
        c.serveDrinks();
        c.serveSnacks();
    }

    public void cruise(Airplane a) {
        a.takeOff();
        a.fly();
        a.serveDrinks();
        a.serveSnacks();
        a.land();

    }

    public void luxuryCruise(PrivatePlane p) {
        p.takeOff();
        p.serveChampagne();
        p.land();
    }
}
