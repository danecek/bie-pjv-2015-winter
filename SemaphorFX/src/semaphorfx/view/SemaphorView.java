/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import semaphorfx.model.SemaphorModel;

public class SemaphorView extends VBox {

    SemaphorModel semaphorModel;
    List<Light> lights = new ArrayList<>();

    public SemaphorView(SemaphorModel semaphorModel, int radius, Color ... colors) {
        this.semaphorModel = semaphorModel;
        for (Color color : colors) {
            lights.add(new Light(color, radius));
        }
        getChildren().addAll(lights);
        fire();
    }

    public final void fire() {
        Set<Color> colors = semaphorModel.getState().getColors();
        for (Light l : lights) {
            l.setOn(colors.contains(l.getColor()));
        }
    }

}
