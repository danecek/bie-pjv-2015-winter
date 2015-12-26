/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphorfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphorfx.controller.SemTask;
import semaphorfx.model.SemaphorModel;
import semaphorfx.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class SemaphorFX extends Application {

    SemTask st;

    @Override
    public void start(Stage primaryStage) {

        SemaphorModel model = new SemaphorModel();
        SemaphorView semaphorView = new SemaphorView(model, 30, Color.RED, Color.YELLOW, Color.GREEN);
        model.setSemaphorView(semaphorView);
        Button nextBtn = new Button("Next");
        nextBtn.setOnAction((ActionEvent event) -> {
            model.next();
        });

        Button startBtn = new Button("Start");
        startBtn.setOnAction((ActionEvent event) -> {
            st = new SemTask(model);
            st.start();
        });
        Button stopBtn = new Button("Stop");
        stopBtn.setOnAction((ActionEvent event) -> {
            if (st != null)
            st.myStop();
        });
        HBox btns = new HBox(startBtn, stopBtn, nextBtn);
        btns.setPadding(new Insets(5));
        btns.setSpacing(5);
        VBox root = new VBox(semaphorView, btns);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root);

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

    private void myStop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
