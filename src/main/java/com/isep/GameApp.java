package com.isep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/GameMenu.fxml")));
        Scene scene = new Scene(root, 1200, 800);
        stage.setMinWidth(700.0);
        stage.setMinHeight(500.0);
        stage.setTitle("Mini RPG Lite 3000 Samia ZEMITI");
        stage.setScene(scene);
        stage.setFullScreen(false);
        stage.show();
        stage.centerOnScreen();
    }
}
