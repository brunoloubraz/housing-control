package com.project.controller;

import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void handleReturnButtonAction(ActionEvent event) {
        try {
            Parent helloView = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            Scene helloScene = new Scene(helloView);

            // Obtenha o Stage atual a partir do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(helloScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        try {
            Parent loginView = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("login-view.fxml")));
            Scene loginScene = new Scene(loginView);

            // Obtenha o Stage atual a partir do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(loginScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleRegisterButtonAction(ActionEvent event) {
        try {
            Parent RegisterView = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("register-view.fxml")));
            Scene registerScene = new Scene(RegisterView);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(registerScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}