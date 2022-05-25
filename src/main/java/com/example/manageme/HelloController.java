package com.example.manageme;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        System.out.println("Welcome to JavaFX Application!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("normal.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 620, 620);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    // for loading the fxml file of emergency when clicked
    @FXML
    protected void onEmergencyButtonClick() throws IOException {
        System.out.println("Welcome to JavaFX Application!");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("emergency.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 620, 620);
        Stage stage = new Stage();
        stage.setTitle("Emergency!");
        stage.setScene(scene);
        stage.show();
    }

}