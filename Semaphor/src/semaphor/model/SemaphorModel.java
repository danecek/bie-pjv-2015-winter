/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import semaphor.view.SemaphorDevice;

/**
 *
 * @author danecek
 */
public class SemaphorModel {

    private SemaphorState state = RedYellowState.INST;
    private SemaphorDevice sd;

    /**
     * @return the state
     */
    public SemaphorState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(SemaphorState state) {
        this.state = state;
    }

    public void goToNextState() {
        state.leave(this);
        sd.fire();
    }

    /**
     * @return the sd
     */
    public SemaphorDevice getSd() {
        return sd;
    }

    /**
     * @param sd the sd to set
     */
    public void setSd(SemaphorDevice sd) {
        this.sd = sd;
    }

}
