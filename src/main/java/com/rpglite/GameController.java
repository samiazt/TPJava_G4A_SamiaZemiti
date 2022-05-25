package com.rpglite;

import com.rpglite.utils.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    protected void playGame (ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Scene.class.getResource("/fxml/CreateHeroes.fxml")));
        Scene.nextScene(e, root);
    }

    @FXML
    protected void exit (ActionEvent e) {
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
