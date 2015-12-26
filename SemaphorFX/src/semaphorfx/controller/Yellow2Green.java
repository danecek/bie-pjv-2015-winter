/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.controller;

import semaphorfx.controller.Green2Yellow;
import javafx.scene.paint.Color;
import semaphorfx.model.SemaphorModel;
import semaphorfx.model.State;

/**
 *
 * @author danecek
 */
public class Yellow2Green extends State {

    static Yellow2Green instance = new Yellow2Green(Color.GREEN);

    public Yellow2Green(Color... colors) {
        super(colors);
    }

    @Override
    public void enter(SemaphorModel sm) {
        sm.setState(Green2Yellow.instance);
    }

}
