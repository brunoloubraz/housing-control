package com.project.controller;

import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegisterController {
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
}
