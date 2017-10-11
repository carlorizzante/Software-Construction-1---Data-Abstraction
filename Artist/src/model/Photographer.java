package model;

import javafx.scene.Camera;
import javafx.scene.effect.Light;

import java.util.List;

/**
 * Created by carlorizzante on 26/08/17.
 */
public class Photographer extends Artist {

    public Camera camera;
    public List<Light> lights;
    private String name;

    public Photographer() {
    }

    @Override
    public Art createArt() {
        System.out.println("Took new photo.");
        return new Art();
    }

//    @Override
//    public Art createArt(String title) {
//        System.out.println("Took new photo with title " + title + "!");
//        return new Art();
//    }
}
