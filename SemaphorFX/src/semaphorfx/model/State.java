/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public abstract class State {

    public State(Color... colors) {
        this.colors = new HashSet(Arrays.asList(colors));
    }

    protected Set<Color> colors;

    public abstract void enter(SemaphorModel sm);

    public void leave(SemaphorModel sm) {
    }

    public Set<Color> getColors() {
        return colors;
    }

}
