package com.isep;


import com.isep.rpg.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SpecialController implements Initializable {
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameField;
    @FXML
    private ToggleButton warriorClass;
    @FXML
    private ToggleButton hunterClass;
    @FXML
    private ToggleButton mageClass;
    @FXML
    private ToggleButton healerClass;
    @FXML
    private Button confirm;

    private int heroClass;

    protected static ArrayList<Hero> heroes = new ArrayList<>();

    private int i = 1;

    @FXML
    protected void warriorClass() {
        this.warriorClass.setStyle("-fx-opacity: 1.0;");
        this.hunterClass.setStyle("-fx-opacity: 0.5;");
        this.mageClass.setStyle("-fx-opacity: 0.5;");
        this.healerClass.setStyle("-fx-opacity: 0.5;");
        this.confirm.setDisable(this.nameField.getText().trim().isEmpty());
        this.heroClass = 1;
    }

    @FXML
    protected void hunterClass() {
        this.warriorClass.setStyle("-fx-opacity: 0.5;");
        this.hunterClass.setStyle("-fx-opacity: 1.0;");
        this.mageClass.setStyle("-fx-opacity: 0.5;");
        this.healerClass.setStyle("-fx-opacity: 0.5;");
        this.confirm.setDisable(this.nameField.getText().trim().isEmpty());
        this.heroClass = 2;
    }

    @FXML
    protected void mageClass() {
        this.warriorClass.setStyle("-fx-opacity: 0.5;");
        this.hunterClass.setStyle("-fx-opacity: 0.5;");
        this.mageClass.setStyle("-fx-opacity: 1.0;");
        this.healerClass.setStyle("-fx-opacity: 0.5;");
        this.confirm.setDisable(this.nameField.getText().trim().isEmpty());
        this.heroClass = 3;
    }

    @FXML
    protected void healerClass() {
        this.warriorClass.setStyle("-fx-opacity: 0.5;");
        this.hunterClass.setStyle("-fx-opacity: 0.5;");
        this.mageClass.setStyle("-fx-opacity: 0.5;");
        this.healerClass.setStyle("-fx-opacity: 1.0;");
        this.confirm.setDisable(this.nameField.getText().trim().isEmpty());
        this.heroClass = 4;
    }

    @FXML
    protected void confirm(ActionEvent e) throws IOException {
        if (this.i < CreateHeroes.numberOfHeroes){
            chooseHero(heroes);
            this.nameLabel.setText("What is the name of the " + heroNumber(this.i) + " hero?");
            this.nameField.setText("");
            this.confirm.setDisable(true);
            ++i;
        } else {
            chooseHero(heroes);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
            Parent root = loader.load();
            Controller mainController = loader.getController();
            for (int i = 0; i < heroes.size(); i++) {
                Label name = new Label();
                name.setText(heroes.get(i).name);
                name.setStyle("-fx-font: bold 24px BiauKai; -fx-text-fill: white;");
                mainController.displayHero(name, heroes.get(i).sprite, i);
            }
            Scene.nextScene(e, root);
        }
    }

    private void chooseHero(ArrayList<Hero> heroes) {
        switch (this.heroClass) {
            case 1 -> {
                Warrior warrior = new Warrior();
                warrior.name = this.nameField.getText().trim();
                heroes.add(warrior);
                this.warriorClass.setStyle("-fx-opacity: 0.5;");
            }
            case 2 -> {
                Hunter hunter = new Hunter();
                hunter.name = this.nameField.getText().trim();
                heroes.add(hunter);
                this.hunterClass.setStyle("-fx-opacity: 0.5;");
            }
            case 3 -> {
                Mage mage = new Mage();
                mage.name = this.nameField.getText().trim();
                heroes.add(mage);
                this.mageClass.setStyle("-fx-opacity: 0.5;");
            }
            case 4 -> {
                Healer healer = new Healer();
                healer.name = this.nameField.getText().trim();
                heroes.add(healer);
                this.healerClass.setStyle("-fx-opacity: 0.5;");
            }
        }
    }

    private String heroNumber(int number){
        String heroNumber = null;
        number += 1;
        switch (number) {
            case 2 -> heroNumber = number + "nd";
            case 3 -> heroNumber = number + "rd";
            case 4 -> heroNumber = number + "th";
        }
        return heroNumber;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.confirm.setDisable(true);
    }
}
