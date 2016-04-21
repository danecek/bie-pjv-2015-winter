/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import semaphor.model.SemaphorModel;

/**
 *
 * @author danecek
 */
public class SemaphorView extends VBox {

    private final List<Light> lights;
    private final SemaphorModel model;

    public SemaphorView(int radius, SemaphorModel model, Color... cols) {
        this.model = model;
        setPadding(new Insets(5));
        setSpacing(5);
        setPressed(true);
        setMaxWidth(USE_PREF_SIZE);
        setBackground(new Background(new BackgroundFill(Color.LIGHTGREY, CornerRadii.EMPTY, Insets.EMPTY)));
        setAlignment(Pos.CENTER_RIGHT);
        model.setSemaphorView(this);
        lights = new ArrayList<>();
        for (Color c : cols) {
            lights.add(new Light(c, true, radius));
        }
        getChildren().addAll(lights);
    }

    public void fire() {
        Set<Color> onColors = model.getState().getColors();
        for (Light light : lights) {
            light.setOn(onColors.contains(light.getCol()));
        }
    }

}
