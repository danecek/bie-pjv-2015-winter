/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import semaphor.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class SemaphorModel {

    private SemaphorState currentState = RedState.INST;
    private SemaphorView semaphorView;

    /**
     * @return the state
     */
    public SemaphorState getState() {
        return currentState;
    }

    /**
     * @param state the state to set
     */
    public void setState(SemaphorState state) {
        this.currentState = state;
    }

    public void goToNextState() {
        currentState.leave(this);
        semaphorView.fire();
    }

    /**
     * @param semaphorView the semaphorView to set
     */
    public void setSemaphorView(SemaphorView semaphorView) {
        this.semaphorView = semaphorView;
    }

}
