package com.project.controller;

import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {

  @FXML
  private TextField nome;

  @FXML
  private TextField rg;

  @FXML
  private TextField cpf;

  @FXML
  private PasswordField senha;

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
  private void handleRegisterButtonAction(ActionEvent event) {
    System.out.println("development");
  }

}
