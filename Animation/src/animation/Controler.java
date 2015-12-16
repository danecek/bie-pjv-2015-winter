/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Controler extends Thread {

    Circle c;

    public Controler(Circle c) {
        this.c = c;
    }

    @Override
    public void run() {
        AnimationStep step = new AnimationStep(c);
        for (;;) {
            try {
                Platform.runLater(step);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
