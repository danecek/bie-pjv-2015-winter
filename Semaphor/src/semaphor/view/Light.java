/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Light extends StackPane {
    
    private Color col;
    private boolean on;
    private Circle c;
    
    public Light(Color col, boolean on, int radius) {
        this.col = col;
        this.on = on;
        c = new Circle(radius, col);
        getChildren().add(c);
    }

    /**
     * @return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
        if (on) {
            c.setFill(col);
        } else {
            c.setFill(Color.DARKGREY);
        }
    }

    /**
     * @return the col
     */
    public Color getCol() {
        return col;
    }
    
}
