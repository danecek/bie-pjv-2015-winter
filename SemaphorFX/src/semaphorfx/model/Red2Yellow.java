/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.model;

import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class Red2Yellow extends State {

    public static Red2Yellow instance = new Red2Yellow();

    public Red2Yellow() {
        super(Color.RED, Color.YELLOW);
    }

    @Override
    public void leave(SemaphorModel sm) {
        sm.setState(Yellow2Green.instance);
    }

}
