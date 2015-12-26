/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.controller;

import semaphorfx.controller.Red2Yellow;
import javafx.scene.paint.Color;
import semaphorfx.model.SemaphorModel;
import semaphorfx.model.State;

/**
 *
 * @author danecek
 */
public class Yellow2Red extends State {

    static Yellow2Red instance = new Yellow2Red(Color.RED);

    public Yellow2Red(Color... colors) {
        super(colors);
    }

    @Override
    public void enter(SemaphorModel sm) {
        sm.setState(Red2Yellow.instance);
    }

}
