/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.util.Random;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
class RunnableImpl implements Runnable {

    private final Circle c;
    private final int i;

    public RunnableImpl(Circle c, int i) {

        this.c = c;
        this.i = i;
    }

    @Override
    public void run() {
        c.relocate(i, i);
    }

}
