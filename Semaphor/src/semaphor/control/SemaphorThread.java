/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import semaphor.model.SemaphorModel;

/**
 *
 * @author danecek
 */
public class SemaphorThread extends Thread {

    SemaphorModel sm;
    boolean runFl = true;

    public SemaphorThread(SemaphorModel sm) {
        this.sm = sm;
    }

    @Override
    public void run() {
        while (runFl) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    sm.goToNextState();
                }
            });
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphorThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void myStop() {
        runFl = false;
    }

}
