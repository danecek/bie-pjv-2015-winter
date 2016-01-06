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
public class RedYellowState extends SemaphorState {
    
    public static RedYellowState INST = new RedYellowState();

    private RedYellowState() {
        super(Color.RED, Color.YELLOW);
    }

    @Override
    public void leave(SemaphorModel model) {
        model.setState(GreenState.INST);
    }

}
