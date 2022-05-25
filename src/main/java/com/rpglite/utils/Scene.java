package com.rpglite.utils;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Scene {
    public static void nextScene(ActionEvent e, Parent root) {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 1200, 800);
        stage.setMinWidth(900.0);
        stage.setMinHeight(600.0);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
        stage.centerOnScreen();
    }
}
