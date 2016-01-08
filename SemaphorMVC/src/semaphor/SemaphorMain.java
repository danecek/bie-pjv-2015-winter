/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.control.SemaphorThread;
import semaphor.model.SemaphorModel;
import semaphor.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class SemaphorMain extends Application {

    private SemaphorThread st;
    private SemaphorModel sm;

    private class StartButton extends Button {

        StartButton() {
            super("Start");
            setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (st == null) {
                        st = new SemaphorThread(sm);
                        st.start();
                    }
                }
            });
        }
    }

    private class StopButton extends Button {

        StopButton() {
            super("Stop");
            setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (st != null) {
                        st.myStop();
                        st=null;
                    }
                }
            });
        }
    }

    private class NextButton extends Button {

        NextButton() {
            super("Next");
            setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sm.goToNextState();
                }
            });
        }
    }

    private class ButtonBox extends HBox {

        public ButtonBox() {
            super(5, new NextButton(), new StartButton(), new StopButton());
            setAlignment(Pos.CENTER);
            setPadding(new Insets(5));
        }
    }

    @Override
    public void start(Stage primaryStage) {
        sm = new SemaphorModel();
        SemaphorView sd = new SemaphorView(30, sm, Color.RED, Color.YELLOW, Color.GREEN);

        VBox root = new VBox(sd, new ButtonBox());
        root.setAlignment(Pos.CENTER);

        sd.fire();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Semaphor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
