package com.isep;

import com.isep.rpg.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CreateHeroes implements Initializable {
    protected static int numberOfHeroes;

    @FXML
    protected void oneHero (ActionEvent e) throws IOException {
        numberOfHeroes = 1;
        Parent root = FXMLLoader.load(Objects.requireNonNull(Scene.class.getResource("/fxml/PersonalizeHeroes.fxml")));
        Scene.nextScene(e, root);
    }

    @FXML
    protected void twoHeroes (ActionEvent e) throws IOException {
        numberOfHeroes = 2;
        Parent root = FXMLLoader.load(Objects.requireNonNull(Scene.class.getResource("/fxml/PersonalizeHeroes.fxml")));
        Scene.nextScene(e, root);
    }

    @FXML
    protected void threeHeroes (ActionEvent e) throws IOException {
        numberOfHeroes = 3;
        Parent root = FXMLLoader.load(Objects.requireNonNull(Scene.class.getResource("/fxml/PersonalizeHeroes.fxml")));
        Scene.nextScene(e, root);
    }

    @FXML
    protected void fourHeroes (ActionEvent e) throws IOException {
        numberOfHeroes = 4;
        Parent root = FXMLLoader.load(Objects.requireNonNull(Scene.class.getResource("/fxml/PersonalizeHeroes.fxml")));
        Scene.nextScene(e, root);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
