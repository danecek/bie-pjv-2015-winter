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
public class GreenState extends SemaphorState {

    public static SemaphorState INST = new GreenState();

    private GreenState() {
        super(Color.GREEN);
    }

    @Override
    public void leave(SemaphorModel model) {
        model.setState(YellowState.INST);
    }

}
