package com.project.controller;

import com.project.database.DatabaseUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// telefone TEXT NOT NULL
public class MainApplication extends Application {

    private DatabaseUtil db = new DatabaseUtil();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Controle - Portal dos lagos");
        stage.setScene(scene);
        stage.show();

        db.getConnection();
    }

    public static void main(String[] args) {
        launch();
    }
}