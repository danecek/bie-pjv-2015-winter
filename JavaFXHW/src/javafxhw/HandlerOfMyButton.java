/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxhw;

import java.util.Date;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author danecek
 */
public class HandlerOfMyButton implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Date actualTime = new Date();
        JavaFXHW.txt.setText(actualTime.toString());
    }

}
