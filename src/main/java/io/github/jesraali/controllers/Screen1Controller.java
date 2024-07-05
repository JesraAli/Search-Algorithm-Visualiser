package io.github.jesraali.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class Screen1Controller {

    @FXML
    private StackPane rootPane;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private AnchorPane optionsPane;

    @FXML
    private Button algorithmOptionsButton;

    @FXML
    private Button closeOptionsButton;

    @FXML
    private Button saveSelectionButton;

//    @FXML
    // Initialize() is the javafx function to initialise the controller
    // Is used to set up initial values for UI components, & add listeners to UI components
//    private void initialize() {
//        optionsPane.setVisible(false); // Start with the options pane hidden
//
//        algorithmOptionsButton.setOnAction(event -> showOptionsPane());
//        closeOptionsButton.setOnAction(event -> hideOptionsPane());
//        saveSelectionButton.setOnAction(event -> saveOptions());
//    }
//
//    private void showOptionsPane() {
//        mainPane.setVisible(false);
//        optionsPane.setVisible(true);
//    }
//
//    private void hideOptionsPane() {
//        optionsPane.setVisible(false);
//        mainPane.setVisible(true);
//    }
//
//    private void saveOptions() {
//        // Implement the logic to save selected options
//        hideOptionsPane();
//    }
}
