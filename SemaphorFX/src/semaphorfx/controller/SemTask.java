/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import semaphorfx.model.SemaphorModel;

public class SemTask extends Thread {

    private final SemaphorModel sm;
    private boolean runFl = true;

    public SemTask(SemaphorModel sm) {
        this.sm = sm;
    }

    @Override
    public void run() {
        try {
            while (runFl) {
                Platform.runLater(sm::next);
                Thread.sleep(1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(SemTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void myStop() {
        runFl = false;
    }

}
