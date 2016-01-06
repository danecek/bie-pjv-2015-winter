/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import java.util.HashSet;
import java.util.Set;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public abstract class SemaphorState {

    public SemaphorState(Color... cols) {
        colors = new HashSet<>();
        for (Color c : cols) {
            colors.add(c);
        }
    }
    private Set<Color> colors;

    /**
     * @return the colors
     */
    public Set<Color> getColors() {
        return colors;
    }
    
    abstract public void leave(SemaphorModel model);
}
