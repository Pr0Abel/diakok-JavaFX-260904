package com.example.diakok;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

public class DiakokController {
    @FXML
    private Label welcomeText;

    private Students students;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle) {

    }
}