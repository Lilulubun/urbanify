package com.example.latihan2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}