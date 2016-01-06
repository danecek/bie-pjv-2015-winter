/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx.model;

import semaphorfx.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class SemaphorModel {

    private State state = Red2Yellow.instance;
    private SemaphorView semaphorView;

    public SemaphorModel() {
    }

    public void next() {
        state.leave(this);
        semaphorView.fire();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    /**
     * @return the semaphorView
     */
    public SemaphorView getSemaphorView() {
        return semaphorView;
    }

    public void setSemaphorView(SemaphorView semaphorView) {
        this.semaphorView = semaphorView;
    }

}
