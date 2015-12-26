/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.controller;

import javafx.scene.paint.Color;
import semaphorfx.model.SemaphorModel;
import semaphorfx.model.State;

/**
 *
 * @author danecek
 */
public class Green2Yellow extends State {

    static Green2Yellow instance = new Green2Yellow(Color.YELLOW);

    private Green2Yellow(Color... colors) {
        super(colors);
    }

    @Override
    public void enter(SemaphorModel sm) {
        sm.setState(Yellow2Red.instance);
    }

}
