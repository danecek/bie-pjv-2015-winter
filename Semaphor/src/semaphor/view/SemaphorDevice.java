/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import semaphor.model.SemaphorModel;

/**
 *
 * @author danecek
 */
public class SemaphorDevice extends VBox {

    List<Light> lights;
     SemaphorModel model;

    public SemaphorDevice(int radius, SemaphorModel model, Color... cols) {
        this.model = model;
        model.setSd(this);
        lights = new ArrayList<>();
        for (Color c : cols) {
            Light l = new Light(c, true, radius);
            this.getChildren().add(l);
            lights.add(l);
        }
    }

    public void fire() {
        for (Light l : lights) {
            l.setOn(model.getState().getColors().contains(l.getCol()));
        }
    }

}
