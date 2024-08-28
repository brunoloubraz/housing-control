package com.project.controller;

import java.util.Objects;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

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
    System.out.println("development");
  }
}
