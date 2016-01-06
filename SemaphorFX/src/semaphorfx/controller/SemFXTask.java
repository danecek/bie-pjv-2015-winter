/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.controller;

import javafx.concurrent.Task;
import semaphorfx.model.SemaphorModel;

public class SemFXTask extends Task {

    SemaphorModel sm;

    public SemFXTask(SemaphorModel sm) {
        this.sm = sm;
    }

    @Override
    protected Object call() throws Exception {
        for (int i = 0; i < 10; i++) {

            sm.next();
            Thread.sleep(300);
        }
        return null;
    }

}
