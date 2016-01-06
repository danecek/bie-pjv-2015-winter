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
public class YellowState extends SemaphorState {
    
    public static YellowState INST = new YellowState();

    private YellowState() {
        super(Color.YELLOW);
    }

    @Override
    public void leave(SemaphorModel model) {
        model.setState(RedState.INST);
    }

}
