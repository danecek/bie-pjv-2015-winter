/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.control.SemaphorThread;
import semaphor.model.SemaphorModel;
import semaphor.view.SemaphorDevice;

/**
 *
 * @author danecek
 */
public class SemaphorMain extends Application {
    
    SemaphorThread st;

    @Override
    public void start(Stage primaryStage) {
        SemaphorModel sm = new SemaphorModel();
        SemaphorDevice sd = new SemaphorDevice(30, sm, Color.RED, Color.YELLOW, Color.GREEN);
        Button start = new Button("Start");
        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                st = new SemaphorThread(sm);
                st.start();
            }
        });
        Button stop = new Button("Stop");
        stop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (st !=null)
                st.myStop();
            }
        });

        Button btn = new Button("Next");
        btn.setText("Next");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                sm.goToNextState();
                sd.fire();
            }
        });

        VBox root = new VBox();

        sd.fire();
        root.getChildren().addAll(sd, new HBox(btn, start, stop));

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
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
