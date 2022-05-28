package com.example.manageme;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloController {
    @FXML
    public TextField namebasenormal;
    @FXML
    private Label welcomeText;
    @FXML
    public Label discount;
    @FXML
    public Label tax;
    @FXML
    public Label total;
    @FXML
    public TextField nameclass;
    @FXML
    public TextField namebase;

    @FXML
    public Button closeButton;
   

    @FXML
    protected void onHelloButtonClick() throws IOException {
        System.out.println("Welcome to JavaFX Application!");

        Stage win =(Stage) closeButton.getScene().getWindow();
        win.close();

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
        Stage win =(Stage) closeButton.getScene().getWindow();
        win.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("emergency.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 620);
        Stage stage = new Stage();
        stage.setTitle("Emergency!");
        stage.setScene(scene);
        stage.show();
    }

    // send to hello-view.fxml
    @FXML
    protected void onHomeButtonClick() {
        System.out.println("Welcome to JavaFX Application!");
        Stage win =(Stage) closeButton.getScene().getWindow();
        win.close();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 620, 620);
            Stage stage = new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // for normal patient window
    @FXML
    protected void onnormalsubmit() {
        // class
        // for normal patient window tax 12%
        // for A discount is 5% for B discount is 10% for C discount is 15% for D
        // discount is 20%

        double tax12;
        // set text tax to label
        tax12 = 12;
        tax12 = tax12 / 100;
        // set text
        tax.setText(String.valueOf(tax12));
        // set text discount to label
        int discont;
        String classofpatient = nameclass.getText();
        switch (classofpatient) {
            case "A":
                discont = 5;
                discount.setText(String.valueOf(discont));
                // get text from base
                String namebase = namebasenormal.getText();
                // convert to int
                double namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "B":
                discont = 10;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "C":
                discont = 15;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "D":
                discont = 20;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            default:
                discont = 0;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;

        }

        // discount.setText(String.valueOf(discont));
        // // get text from base
        // String namebase = namebasenormal.getText();
        // // convert to int
        // double namebaseint = Integer.parseInt(namebase);

        // namebaseint = (namebaseint + (namebaseint * tax12)) - discont;

        // total.setText(String.valueOf(namebaseint));

    }

    @FXML
    protected void onemergencysubmit() {
        // for emergency patient window tax 10%
        // for A discount is 5% for B discount is 10% for C discount is 15% for D discount is 20%
        double tax10;
        // set text tax to label
        tax10 = 10;
        tax10 = tax10 / 100;
        // set text
        tax.setText(String.valueOf(tax10));
        // set text discount to label
        int discont;
        String classofpatient = nameclass.getText();
        switch (classofpatient) {
            case "A":
                discont = 5;
                discount.setText(String.valueOf(discont));
                // get text from base
                String namebase = namebasenormal.getText();
                // convert to int
                double namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax10)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "B":
                discont = 10;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax10)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "C":
                discont = 15;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax10)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            case "D":
                discont = 20;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);

                namebaseint = (namebaseint + (namebaseint * tax10)) - discont;

                total.setText(String.valueOf(namebaseint));
                break;
            default:
                discont = 0;
                discount.setText(String.valueOf(discont));
                // get text from base
                namebase = namebasenormal.getText();
                // convert to int
                namebaseint = Double.parseDouble(namebase);
                namebaseint = (namebaseint + (namebaseint * tax10)) - discont; 
                total.setText(String.valueOf(namebaseint));
                break;
        }


        

        

    }
}