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

    SemaphorThread st;

    @Override
    public void start(Stage primaryStage) {
        SemaphorModel sm = new SemaphorModel();
        SemaphorView sd = new SemaphorView(30, sm, Color.RED, Color.YELLOW, Color.GREEN);
        Button startButton = new Button("Start");
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (st == null) {
                    st = new SemaphorThread(sm);
                    st.start();
                }

            }
        });
        Button stopButton = new Button("Stop");
        stopButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (st != null) {
                    st.myStop();
                }
                st = null;
            }
        });

        Button nextButton = new Button("Next");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                sm.goToNextState();
                sd.fire();
            }
        });
        HBox buttonBox = new HBox(nextButton, startButton, stopButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(5);
        buttonBox.setPadding(new Insets(5));

        VBox root = new VBox(sd, buttonBox);
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
