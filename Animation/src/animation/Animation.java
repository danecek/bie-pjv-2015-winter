/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class Animation extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle c = new Circle(10, Color.RED);

        Pane root = new Pane();
        root.getChildren().add(c);
        //c.relocate(20, 20);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Moving point");
        primaryStage.setScene(scene);
        primaryStage.show();
        new Controler(c).start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
