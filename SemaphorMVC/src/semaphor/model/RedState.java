/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class RedState extends SemaphorState {

    public static RedState INST = new RedState();

    public RedState() {
        super(Color.RED);
    }

    @Override
    public void leave(SemaphorModel model) {
        model.setState(RedYellowState.INST);
    }

}
