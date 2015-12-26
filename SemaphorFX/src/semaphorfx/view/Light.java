/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.view;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Light extends StackPane {

    private final Circle circle;
    private final Color color;

    public Light(Color color, int radius) {
        this.circle = new Circle(radius);
        this.color = color;
        getChildren().add(circle);
        setOnMouseClicked((MouseEvent event) -> {
        });
    }

    public void setOn(boolean on) {
        if (on) {
            circle.setFill(color);
        } else {
            circle.setFill(Color.GRAY);
        }

    }

    public Color getColor() {
        return color;
    }

}
