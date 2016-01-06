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
public class Yellow2Green extends State {

    static Yellow2Green instance = new Yellow2Green();

    public Yellow2Green() {
        super(Color.GREEN);
    }

    @Override
    public void leave(SemaphorModel sm) {
        sm.setState(Green2Yellow.instance);
    }

}
