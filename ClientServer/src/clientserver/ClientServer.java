/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class ClientServer extends Application {

    Socket s;
    PrintWriter pw;
    BufferedReader br;

    public ClientServer() {
        try {
            s = new Socket("localhost", 3333);
            s.setSoTimeout(3000);
            pw = new PrintWriter(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        } catch (IOException ex) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.show();

        }
    }

    private void sentToServer(String text) {
        pw.println(text);
        pw.flush();
    }

    String waitForAnsver() throws IOException {
        return br.readLine();
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Translate");
        TextField inputTtext = new TextField();
        Text outputText = new Text();
        btn.setOnAction(
                new /* implements */ EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    sentToServer(inputTtext.getText());
                    outputText.setText(waitForAnsver());
                } catch (IOException ex) {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.show();
                }

            }

        });

        VBox root = new VBox();
        root.getChildren().addAll(inputTtext, outputText, btn);

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
