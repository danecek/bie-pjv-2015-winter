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
public class Green2Yellow extends State {

    static Green2Yellow instance = new Green2Yellow();

    private Green2Yellow() {
        super(Color.YELLOW);
    }

    @Override
    public void leave(SemaphorModel sm) {
        sm.setState(Yellow2Red.instance);
    }

}
