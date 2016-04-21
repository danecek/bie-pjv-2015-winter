/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxhw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class JavaFXHW extends Application {
    
    static Text txt;
    
    @Override
    public void start(Stage primaryStage) {
         txt = new Text("XXX");
        Button btn = new Button("Current date!");

        btn.setOnAction(new HandlerOfMyButton());
        
        VBox root = new VBox();
        root.getChildren().addAll(txt, btn);
        
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
