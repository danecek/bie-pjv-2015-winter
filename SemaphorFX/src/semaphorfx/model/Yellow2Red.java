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
public class Yellow2Red extends State {

    static Yellow2Red instance = new Yellow2Red();

    public Yellow2Red() {
        super(Color.RED);
    }

    @Override
    public void leave(SemaphorModel sm) {
        sm.setState(Red2Yellow.instance);
    }

}
